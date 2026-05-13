package latihan_pbo.latihan6_exception;

public class Tes {
    public static void main(String[] args) {
        
        int[] angka = {1, 2, 3};
        // System.out.println(angka[5]);
        // System.out.println("Program selesai");;
        try{
            System.out.println(angka[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi error: " + e);
        } finally{
            System.out.println("Program selesai");
        }
    }
    
}
