import java.util.Scanner;

public class PenentuanHari {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode hari ini : ");
        int kode_hari = input.nextInt();
        
            if(kode_hari>=7){System.out.println("ERROR 404");}
            else{
        
        System.out.print("Masukkan kode pasaran :  ");
        int kode_pasar = input.nextInt();
        
            if(kode_pasar>=5) {System.out.println("ERROR 404");}
            else{
               
        System.out.print("Masukkan hari kedepan : ");
        int hari_kedepan = input.nextInt();
        
        int total_hari,total_pasar;
        total_hari = (kode_hari + hari_kedepan) % 7;
        total_pasar = (kode_pasar + hari_kedepan) % 5;
        
        String nama_hari; 
        switch(total_hari) {
            
            case 0:
                nama_hari = "Minggu.";
                break;
                
            case 1:
                nama_hari = "Senin.";
                break;
                
            case 2:
                nama_hari = "Selasa.";
                break;
                
            case 3:
                nama_hari = "Rabu.";
                break;
                
            case 4:
                nama_hari = "Kamis.";
                break;
                
            case 5:
                nama_hari = "Jumat.";
                break;
                
            case 6:
                nama_hari = "Sabtu.";
                break;
                
            default:
                nama_hari = "ERROR 404";
      
        }
        
        String nama_pasar;
        switch(total_pasar){
            
            case 0:
                nama_pasar = "Pon";
                break;
                
            case 1:
                nama_pasar = "Wage";
                break;
                
            case 2:
                nama_pasar = "Kliwon";
                break;
                
            case 3:
                nama_pasar = "Legi";
                break;
                
            case 4:
                nama_pasar = "Pahing";
                break;
                
            default:
                nama_pasar = "ERROR 404";
        }
        
        System.out.println("Kode hari : " +total_hari);
        System.out.println("Nama hari : " +nama_hari);
        System.out.println("Nama Pasaran : "+nama_pasar);
      
            }
    }
    input.close();
  }  
}
