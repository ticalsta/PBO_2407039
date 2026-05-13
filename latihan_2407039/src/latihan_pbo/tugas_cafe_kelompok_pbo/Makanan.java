package latihan_pbo.tugas_cafe_kelompok_pbo;

public class Makanan extends Menu {
    //Encapsulasi
    private String jenisMakanan;
    private String porsi;

    //Constructor overloading dengan semua parameter
    public Makanan(String nama, double harga, String jenisMakanan, String porsi) {
        super(nama, harga);
        this.jenisMakanan = jenisMakanan;
        this.porsi = porsi;
    }

    //Getter
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public String getPorsi() {
        return porsi;
    }

    //Setter
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public void setPorsi(String porsi) {
        this.porsi = porsi;
    }

    //Setter overloading (pilihan porsi)
    public void setPorsi(int pilihanPorsi) {
        switch (pilihanPorsi) {
            case 1: 
                this.porsi = "Small";   
                break;
            case 2: 
                this.porsi = "Medium"; 
                break;
            case 3: 
                this.porsi = "Large";   
                break;
            default: 
                this.porsi = "Medium";
        }
    }

    //Override
    @Override
    public void detailMenu() {
        System.out.println("-------------------");
        System.out.println("Daftar Menu Makanan");
        System.out.println("-------------------");
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + jenisMakanan);
        System.out.println("Porsi: " + porsi);
        System.out.println("Harga: Rp " + getHarga());
    }

}
