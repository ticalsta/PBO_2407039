package latihan_pbo;


class Cafe{
    String Nama;
    String Alamat;

    Cafe(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat = Alamat;
        System.out.println("nama cafenya adalah " + this.Nama);
        System.out.println("alamatnya ada di daerah: " + this.Alamat);
    }
    void bukaCafe1() {
        System.out.println(this.Nama + "Sudah Buka");
    }
    // void bukaCafe2() {
    //     System.out.println(this.Nama + " cafe sudah buka");
    // }
    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getAlamat(){
        return Alamat;
    }

    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }

}

//kelas main adalah untuk menampilkan program yang akan kita buat
public class Main {
    public static void main(String[] args) {
        System.out.println("============cafe1===============");
        Cafe cafe1 = new Cafe("Esemah ", "Indramayu Kota");
        cafe1.bukaCafe1();
        System.out.println("============cafe2===============");
        Cafe cafe2 = new Cafe("Ranum ", "Indramayu Kota");
        cafe2.bukaCafe1();
        // System.out.println("Tica Lestari");
        // System.out.println("============cafe1===============");
        // Cafe cafe1 = new Cafe("Essemah", "Indramayu Kota");
        // cafe1.bukaCafe1(); 
        // System.out.println("============cafe2===============");
        // Cafe cafe2 = new Cafe("Ranum", "Indramayu Kota");
        // cafe2.bukaCafe2();
        // System.out.println("============thankYou===============");
        // cafe1.Nama = "Kopi Kenangan";
        // cafe1.Alamat = "Indramayu";
        // cafe2.Nama = "kopte";
        // cafe2.Alamat = "IMKOT";

        // System.out.println("============cafe1===============");
        // System.out.println("nama cafenya adalah" + cafe1.Nama);
        // System.out.println("alamatnya ada di kabupaten: " + cafe1.Alamat);
        // 
        // System.out.println("nama cafenya adalah " + cafe2.Nama);
        // System.out.println("alamatnya ada di daerah: " + cafe2.Alamat);
    }
}