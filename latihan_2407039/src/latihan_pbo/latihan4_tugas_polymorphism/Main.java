package latihan_pbo.latihan4_tugas_polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT MENU ===");

        System.out.print("Masukkan jumlah ketoprak: ");
        int j1 = input.nextInt();

        System.out.print("Masukkan jumlah nasi goreng: ");
        int j2 = input.nextInt();

        System.out.print("Masukkan jumlah sogem: ");
        int j3 = input.nextInt();

        // tipe data menu & objek menu item
        Menu m1 = new MenuItem("ketoprak", 12000, j1);
        Menu m2 = new MenuItem("nasi goreng", 15000, j2);
        Menu m3 = new MenuItem("sogem", 8000, j3);

        System.out.println();
        System.out.println("=== HASIL ===");

        ((MenuItem)m1).tampilkan();
        ((MenuItem)m2).tampilkan();
        ((MenuItem)m3).tampilkan();

        int total = m1.hitungTotal() + m2.hitungTotal() + m3.hitungTotal();

        System.out.println("----------------------");
        System.out.println("Total = " + total);

        input.close();
    }
}