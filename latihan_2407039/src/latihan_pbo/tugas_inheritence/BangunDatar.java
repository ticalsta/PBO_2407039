package latihan_pbo.tugas_inheritence;

public class BangunDatar {
    protected double panjang;
    protected double lebar;
    
    //constructor
    public BangunDatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas(){
        return panjang * lebar *2;
    }

    public void tampilkanHasil(){
        System.out.println("panjang: " + panjang);
        System.out.println("lebar = " + lebar);
    }
}
