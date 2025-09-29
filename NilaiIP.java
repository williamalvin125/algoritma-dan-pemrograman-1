import java.util.Scanner;

public class NilaiIP {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        String Nama_Mhs,NRP;
        System.out.print("Nama Mahasiswa : ");
        Nama_Mhs = input.nextLine();
        System.out.print("NRP : ");
        NRP = input.nextLine();
        
        System.out.print("\nMasukkan nilai tugas : ");
        double PGS = input.nextDouble();
        System.out.print("Masukkan nilai kuis 1 : ");
        double kuis1 = input.nextDouble();
        System.out.print("Masukkan nilai kuis 2 : ");
        double kuis2 = input.nextDouble();
        System.out.print("Masukkan nilai ETS : ");
        double ETS = input.nextDouble();
        System.out.print("Masukkan nilai EAS : ");
        double EAS = input.nextDouble();
        
        double Nilai;
        Nilai = (0.2*PGS)+(0.15*kuis1)+(0.15*kuis2)+(0.25*ETS)+(0.25*EAS);
        System.out.println("Nilaimu adalah "+Nilai);
        
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
