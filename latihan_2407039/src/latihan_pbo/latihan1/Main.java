package latihan_pbo.latihan1;

import java.util.Scanner;

class Cafe{
    String nama;
    String alamat;

    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println(nama);
        System.out.println(alamat);
    }
    
    // method
    void buka(){
        System.out.println(" Cafe " + nama + " Sudah Buka ");
    }
}


public class Main {
    public static void main(String[] args) {

    
    // Cafe cafe1 = new Cafe();
    Cafe cafe4 = new Cafe ("esemmah", "Indramayu Kota");
    cafe4.buka();
    // cafe1.nama = "Kopi Kenangan"
    // cafe1.alamat = "Indramayu"

    // cafe cafe2 = new cafe();
    // cafe2 nama = "Esemah Coffe";
    // cafe2.alamat = "Indramayu Kota";

    // cafe.cafe3 = new cafe();
    // cafe2.alamat = "Ranum Coffe";
    // cafe2.alamat = "Indramayu Kota";

    //     System.out.println("Nama Cafenya adalah : " + cafe1.nama);
    //     System.out.println("Alamatnya ada di : " + cafe1.alamat);

    //     System.out.println("Nama Cafenya adalah : " + cafe2.nama);
    //     System.out.println("Alamatnya ada di : " + cafe2.alamat);

    //     System.out.println("Nama cafenya adalah : " + cafe3.nama);
    //     System.out.println("Alamatnya ada di : " + cafe3e3.alamat);
    }
}
