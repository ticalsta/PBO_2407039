package latihan_pbo.latihan1;

class Cafe {
    String nama;
    String alamat;
}

    Cafe(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.print(nama);
        System.out.print(alamat);
    }

//      method
    void buka(){
        System.out.print("Cafe " + nama + "Sudah buka");
    }

}



public class Main {
    public static void main(String[] args) {

        Cafe cafel = new Cafe();
        cafe1.nama = "Kopi Kenangan";
        cafel.alamat = "Indramayu";

        System.out.println("Nama Cafenya adalah : " + cafe1.nama);
        System.out.println("Alamatnya ada di : " + cafe1.alamat);
    }
}
