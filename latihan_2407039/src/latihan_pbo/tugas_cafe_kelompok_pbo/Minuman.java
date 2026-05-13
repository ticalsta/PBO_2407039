package latihan_pbo.tugas_cafe_kelompok_pbo;

public class Minuman extends Menu {
    //Encapsulasi
    private String jenisMinuman;
    private String ukuran;
    private String sugarLevel;

    //Constructor over loading dengan semua parameter
    public Minuman(String nama, double harga, String jenisMinuman, String ukuran, String sugarLevel) {
        super(nama, harga);
        this.jenisMinuman = jenisMinuman;
        this.ukuran = ukuran;
        this.sugarLevel = sugarLevel;
    }

    //Getter
    public String getJenisMinuman() {
        return jenisMinuman;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getSugarLevel() {
        return sugarLevel;
    }


    //Setter
    public void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    //Setter overloading (pilihan ukuran)
    public void setUkuran(int pilihanUkuran) {
        switch (pilihanUkuran) {
            case 1: 
                this.ukuran = "Small";   
                break;
            case 2: 
                this.ukuran = "Medium"; 
                break;
            case 3: 
                this.ukuran = "Large";   
                break;
            default: 
                this.ukuran = "Medium";
        }
    }

    //Setter overloading (pilihan sugarLevel)
    public void setSugarLevel(int persen) {
        if (persen == 0) {
            this.sugarLevel = "No Sugar";
        } else if (persen <= 25) {
            this.sugarLevel = "Less Sugar";
        } else if (persen <= 50) {
            this.sugarLevel = "Half Sugar";
        } else {
            this.sugarLevel = "Normal";
        }
    }

    //Override
    @Override
    public void detailMenu() {
        System.out.println("-------------------");
        System.out.println("Daftar Menu Minuman");
        System.out.println("-------------------");
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + jenisMinuman);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Sugar Level: " + sugarLevel);
        System.out.println("Harga: Rp " + getHarga());
    }
}
