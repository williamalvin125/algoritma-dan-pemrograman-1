import java.util.Scanner;

public class NilaiIPS {

    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        String Nama_Mhs,NRP;
        System.out.print("Nama Mahasiswa : ");
        Nama_Mhs = input.nextLine();
        System.out.print("NRP : ");
        NRP = input.nextLine();
        
        System.out.print("Masukkan nilai IP : ");
        double Nilai = input.nextDouble();
        
        if(Nilai > 100){
            System.out.print("ERROR! Nilai melebihi 100.");
        }
        
        else if(Nilai >=86){
            System.out.print("Nilai A.");
        }
        
        else if(Nilai >=76){
            System.out.print("Nilai AB.");
        }
        
        else if(Nilai >=66){
            System.out.print("Nilai B.");
        }
        
        else if(Nilai >=61){
            System.out.print("Nilai BC.");
        }
        
        else if(Nilai >=56){
            System.out.print("Nilai C.");
        }
        
        else if(Nilai >=41){
            System.out.print("Nilai D.");
        }
        
        else if(Nilai >=0){
            System.out.print("Nilai E.");
        }
        
        else{
        System.out.print("ERROR! Nilai kurang dari 0.");
    }
        input.close();
    }
    
}
