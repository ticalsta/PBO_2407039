package latihan_pbo.latihan4_tugas_polymorphism;

public abstract class Menu {

    // menyimpan nama menu & harga menu
    protected String nama;
    protected int harga;

    public Menu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    // getter : untuk mengambil nilai atribut dri luar class bagian enkapsulasi
    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }

    public abstract int hitungTotal();
}