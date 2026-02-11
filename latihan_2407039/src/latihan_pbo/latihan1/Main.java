package latihan_pbo.latihan1;

import java.util.Scanner;

// import java.util.Scanner;

class Cafe{
    String Nama;
    String alamat;

    Cafe(String Nama, String alamat){
        this.Nama = Nama;
        this.alamat = alamat;
        System.out.println("Nama cafenya adalah " + this.Nama);
        System.out.println("alamatnya ada di daerah: " + this.alamat);
    }
    
    // method
    void buka(){
        System.out.println("Cafe " + Nama + " Sudah Buka ");
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
    public class Main {
        public static void main(String[] args) {

            // Scanner input = new Scanner(System.in);
            // Cafe cafe = new Cafe();

            // System.out.println("Masukkan nama cafe: ");
            // cafe.nama = input.nextLine();

            // System.out.println("nama yang diinput adalah : " + cafe.nama);
            //cafe.buka();
        

    
    // Cafe cafe1 = new Cafe();
    Cafe cafe4 = new Cafe ("essemah", "Indramayu Kota");
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
