package latihan_pbo.latihan4_tugas_polymorphism;

public class MenuItem extends Menu {

    //menyimpan jumlah pesenan
    private int jumlah;


    public MenuItem(String nama, int harga, int jumlah){
        super(nama, harga);     //manggil constuctor dri parent (menu)
        this.jumlah = jumlah;      // isi jumlah
    }

    public int getJumlah(){
        return jumlah;
    }

    // mengisi ulang method dri parent rumus total = harga x jumlah
    @Override
    public int hitungTotal(){
        return harga * jumlah;
    }

    public void tampilkan(){
        System.out.println(nama + " " + harga + " x " + jumlah + " = " + hitungTotal());
    }
}