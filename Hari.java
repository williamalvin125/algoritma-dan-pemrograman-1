import java.util.Scanner;
        
public class Hari {

    public static void main(String[] args) {

       Scanner bil = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari : ");
        int kode_hari = bil.nextInt();
        
        System.out.print("Masukkan hari kedepan : ");
        int hari_kedepan = bil.nextInt();
        
        int kodeHari = (kode_hari + hari_kedepan) % 7;
        
        String namaHari;
        switch(kodeHari) {
            
            case 0:
                namaHari = "Minggu";
                break;
                
            case 1:
                namaHari = "Senin";
                break;
                
            case 2:
                namaHari = "Selasa";
                break;
                
            case 3:
                namaHari = "Rabu";
                break;
                
            case 4:
                namaHari = "Kamis";
                break;
            
            case 5:
                namaHari = "Jumat";
                break;
                
            case 6:
                namaHari = "Sabtu";
                break;
                default:
                namaHari = "Salah";
        }
        
        System.out.println("Nama Hari : " +namaHari);
        System.out.println("Kode Hari : " +kodeHari);
        
        bil.close();
    }
    
}
