package latihan_pbo.tugas_cafe_kelompok_pbo;

import java.util.ArrayList;

public class Cafe {
    //Encapsulaso
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;
    
    //Constructor overloading dengan semua parameter
    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        this.daftarMenu = new ArrayList<>();
    }

    //Getter
    public String getNamaCafe() {
        return namaCafe;
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    //Method tambahMenu
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    //Method tampilkanMenu
    public void tampilkanMenu() {
        System.out.println("==================== DAFTAR MENU ==================");
        System.out.printf("%-5s %-20s %-10s %-12s%n", "No.", "Nama", "Kategori", "Harga");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            //Untuk menentukan kategori (makanan atau minuman)
            String kategori = (m instanceof Makanan) ? "Makanan" : "Minuman";
            System.out.printf("%-5d %-20s %-10s Rp %.0f%n",
                    (i + 1), m.getNama(), kategori, m.getHarga());
        }
        System.out.println("===================================================");
    }

    //Method ambil menu berdasarkan index
    public Menu getMenu(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            return daftarMenu.get(index);
        }
        return null;
    }

    //Method hitung total harga
    public double hitungTotal(ArrayList<int[]> pesanan) {
        double total = 0;
        for (int[] p : pesanan) {
            Menu m = getMenu(p[0]);
            if (m != null) {
                total += m.getHarga() * p[1];
            }
        }
        return total;
    }

    public int jumlahMenu() {
        return daftarMenu.size();
    }

}
