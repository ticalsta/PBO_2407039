package latihan_pbo.latihan_tugas1;

public class Persegi extends BangunDatar {

    public double LuasPersegi(){
        return getSisi()*getSisi();
    }
    public double KelilingPersegi(){
        return 4*getSisi();
    }
}
