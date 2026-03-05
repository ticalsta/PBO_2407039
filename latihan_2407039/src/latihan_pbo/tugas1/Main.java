package latihan_pbo.tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("=== MENU BANGUN DATAR ===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Belah Ketupat");
        System.out.print("Pilih (1/2/3): ");
        int pilih = input.nextInt();

        switch(pilih){

            case 1:
                System.out.print("Masukkan panjang: ");
                bd.setPanjang(input.nextDouble());
                System.out.print("Masukkan lebar: ");
                bd.setLebar(input.nextDouble());

                System.out.println("Luas: " + bd.luasPersegiPanjang());
                System.out.println("Keliling: " + bd.kelilingPersegiPanjang());
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                bd.setAlas(input.nextDouble());
                System.out.print("Masukkan tinggi: ");
                bd.setTinggi(input.nextDouble());
                System.out.print("Masukkan sisi miring: ");
                bd.setSisi(input.nextDouble());

                System.out.println("Luas: " + bd.luasSegitiga());
                System.out.println("Keliling: " + bd.kelilingSegitiga());
                break;

            case 3:
                System.out.print("Masukkan diagonal 1: ");
                bd.setDiagonal1(input.nextDouble());
                System.out.print("Masukkan diagonal 2: ");
                bd.setDiagonal2(input.nextDouble());
                System.out.print("Masukkan sisi: ");
                bd.setSisi(input.nextDouble());

                System.out.println("Luas: " + bd.luasBelahKetupat());
                System.out.println("Keliling: " + bd.kelilingBelahKetupat());
                break;

            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}