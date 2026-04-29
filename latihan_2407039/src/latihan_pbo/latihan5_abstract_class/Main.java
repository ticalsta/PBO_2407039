package latihan_pbo.latihan5_abstract_class;

public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(4),
            new Segitiga(4, 5, 6, 7, 8)
        };

        for (BangunDatar b : bd) {
            b.Display();
            System.out.println("luas: " + b.hitungLuas());
            System.out.println("keliling: " + b.hitungKeliling());
            System.out.println("----------------------");
        }
    }
}
