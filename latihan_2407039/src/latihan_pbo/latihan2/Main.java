package latihan_pbo.latihan2;

//acsess modifer (public, private, protected)
class Persegi{
    private int sisi;

    public int getSisi() {
        return sisi*sisi;
    }
    public double kelilingPersegi(){
        return sisi+sisi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}


public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println(p.getSisi());
        
    }
}