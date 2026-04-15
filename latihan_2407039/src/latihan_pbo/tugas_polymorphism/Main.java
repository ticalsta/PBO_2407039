package latihan_pbo.tugas_polymorphism;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        // Bangun Datar
        bd = new BangunDatar(3, 4);
        bd.tampilkan();

        System.out.println();

        // Persegi
        bd = new Persegi(5);
        bd.tampilkan();

        System.out.println();

        // Persegi Panjang
        bd = new PersegiPanjang(10, 4);
        bd.tampilkan();

        System.out.println();

        // Segitiga
        bd = new Segitiga(6, 3);
        bd.tampilkan();
    }
}