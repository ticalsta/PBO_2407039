package latihan_pbo.tugas_cafe_kelompok_pbo;

public abstract class Menu {
    //Encapsulasi
    private String nama;
    private double harga;

    //Constructor overloading dengan 2 parameter (parameter nama dan harga)
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    //Constructor overloading 1 parameter (parameter nama)
    public Menu(String nama) {
        this.nama = nama;
        this.harga = 0;
    }

    //Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    //Method detailMenu
    public abstract void detailMenu();

}
