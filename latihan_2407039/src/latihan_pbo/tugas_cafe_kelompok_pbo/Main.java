package latihan_pbo.tugas_cafe_kelompok_pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //Objek cafe
        Cafe cafe = new Cafe ("Cafe Reftal");

        //Objek makanan dan minuman (objek makanan dan minuman disimpan dalam tipe Menu)
        Menu nasiGoreng = new Makanan("Nasi Goreng Seafood", 25000, "Nasi", "Medium");
        Menu croissant = new Makanan("Croissant Almond", 18000, "Pastry", "Small");
        Menu saladBuah = new Makanan("Salad Buah Premium", 22000, "Snack", "Large");

        Menu kopiLatte = new Minuman("Kopi Latte", 19000, "Kopi", "Small", "Less Sugar");
        Menu esTehManis = new Minuman("Es Teh Manis", 15000, "Non-Kopi", "Medium", "Normal");
        Menu matchaLatte = new Minuman("Matcha Latte", 25000, "Non-Kopi", "Large", "Half Sugar");

        //Masukkan menu ke dalam cafe
        cafe.tambahMenu(nasiGoreng);
        cafe.tambahMenu(croissant);
        cafe.tambahMenu(saladBuah);
        cafe.tambahMenu(kopiLatte);
        cafe.tambahMenu(esTehManis);
        cafe.tambahMenu(matchaLatte);

        //Tampilan awal
        System.out.println("===============================");
        System.out.println("Selamat Datang di " + cafe.getNamaCafe());
        System.out.println("===============================");

        //Tampilan menu utama
        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Lihat Daftar Menu");
            System.out.println("2. Lihat Detail Menu");
            System.out.println("3. Pesan Menu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = bacaInt();

            switch (pilihan) {
                case 1:
                    cafe.tampilkanMenu();
                    break;
                case 2:
                    lihatDetail(cafe);
                    break;
                case 3:
                    prosesPesanan(cafe);
                    break;
                 case 4:
                    System.out.println("\nTerima kasih telah berkunjung ke Cafe Reftal!");
                    running = false;
                    break;
                default:
                    System.out.println("[!] Pilihan tidak valid. Masukkan angka 1-4.");
            }   
        }

        scanner.close();
    }

    //Method bacaInt
    static int bacaInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("[!] Input harus angka, coba lagi: ");
            }
        }
    }

    //Method pilih porsi makanan
    static void pilihPorsi(Makanan makanan) {
        System.out.println("Pilih Porsi:");
        System.out.println("  1. Small");
        System.out.println("  2. Medium");
        System.out.println("  3. Large");
        System.out.print("Pilih porsi: ");
        int pilihan = bacaInt();

        switch (pilihan) {
            case 1: {
                makanan.setPorsi("Small");
                break;
            }
            case 2: {
                makanan.setPorsi("Medium");
                break;
            }
            case 3: {
                makanan.setPorsi("Large");
                break;
            }
            default: {
                System.out.println("[!] Pilihan tidak valid, porsi diset Regular.");
                makanan.setPorsi("Regular");
            }
        }
    }

    //Method pilih ukuran minuman
    static void pilihUkuran(Minuman minuman) {
        System.out.println("Pilih Ukuran:");
        System.out.println("  1. Small");
        System.out.println("  2. Medium");
        System.out.println("  3. Large");
        System.out.print("Pilih ukuran: ");
        int pilihan = bacaInt();

        switch (pilihan) {
            case 1: {
                minuman.setUkuran("Small");
                break;
            }
            case 2: {
                minuman.setUkuran("Medium");
                break;
            }
            case 3: {
                minuman.setUkuran("Large");
                break;
            }
            default: {
                System.out.println("[!] Pilihan tidak valid, ukuran diset Medium.");
                minuman.setUkuran("Medium");
            }
        }
    }

    //Method pilih sugar level minuman
    static void pilihSugarLevel(Minuman minuman) {
        System.out.println("Pilih Sugar Level:");
        System.out.println("  1. No Sugar");
        System.out.println("  2. Less Sugar");
        System.out.println("  3. Half Sugar");
        System.out.println("  4. Normal");
        System.out.print("Pilih sugar level: ");
        int pilihan = bacaInt();

        switch (pilihan) {
            case 1: {
                minuman.setSugarLevel("No Sugar");
                break;
            }
            case 2: {
                minuman.setSugarLevel("Less Sugar");
                break;
            }
            case 3: {
                minuman.setSugarLevel("Half Sugar");
                break;
            }
            case 4: {
                minuman.setSugarLevel("Normal");
                break;
            }
            default: {
                System.out.println("[!] Pilihan tidak valid, sugar level diset Normal.");
                minuman.setSugarLevel("Normal");
            }
        }
    }

    //Method lihatDetail
    static void lihatDetail(Cafe cafe) {
        cafe.tampilkanMenu();
        System.out.print("Masukkan nomor menu: ");
        int no = bacaInt();

        if (no < 1 || no > cafe.jumlahMenu()) {
            System.out.println("[!] Nomor menu tidak valid.");
            return;
        }

        System.out.println();
        cafe.getMenu(no - 1).detailMenu();
    }

    //Method prosePesanan
    static void prosesPesanan(Cafe cafe) {
        ArrayList<int[]> pesanan    = new ArrayList<>();
        ArrayList<String> ringkasan = new ArrayList<>();

        boolean tambahLagi = true;

        while (tambahLagi) {
            cafe.tampilkanMenu();
            System.out.print("Pilih nomor menu (0 untuk selesai): ");
            int noPilih = bacaInt();

            if (noPilih == 0) {
                break;
            }

            if (noPilih < 1 || noPilih > cafe.jumlahMenu()) {
                System.out.println("[!] Nomor tidak valid!");
                continue;
            }

            Menu dipilih = cafe.getMenu(noPilih - 1);

            // Cek apakah Makanan atau Minuman
            if (dipilih instanceof Makanan) {
                Makanan m = (Makanan) dipilih;
                pilihPorsi(m);
                System.out.println("Porsi: " + m.getPorsi());

            } else if (dipilih instanceof Minuman) {
                Minuman m = (Minuman) dipilih;
                pilihUkuran(m);
                System.out.println("Ukuran: " + m.getUkuran());
                pilihSugarLevel(m);
                System.out.println("Sugar Level: " + m.getSugarLevel());
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = bacaInt();

            if (jumlah <= 0) {
                System.out.println("[!] Jumlah harus lebih dari 0!");
                continue;
            }

            pesanan.add(new int[]{noPilih - 1, jumlah});
            ringkasan.add(jumlah + "x " + dipilih.getNama());
            System.out.println("[+] " + jumlah + "x " + dipilih.getNama() + " ditambahkan.");

            System.out.print("Tambah pesanan lagi? (1=Ya / 0=Tidak): ");
            if (bacaInt() != 1) {
                tambahLagi = false;
            }
        }

        if (pesanan.isEmpty()) {
            System.out.println("[!] Tidak ada pesanan.");
            return;
        }

        // Hitung dan tampilkan struk
        double total = cafe.hitungTotal(pesanan);

        System.out.println("\n============= STRUK PESANAN =============");
        for (int i = 0; i < pesanan.size(); i++) {
            int[] p = pesanan.get(i);
            Menu m  = cafe.getMenu(p[0]);
            System.out.printf("%-25s Rp %.0f%n", ringkasan.get(i), m.getHarga() * p[1]);
        }
        System.out.println("----------------------------------------");
        System.out.printf("%-25s Rp %.0f%n", "TOTAL", total);
        System.out.println("========================================");
    }

}