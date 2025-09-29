import java.util.Scanner;

public class ProgramKonversi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah menit : ");
        int menit = input.nextInt();
        
        int jam = menit/60;
        int hari = jam/24;
        int tahun = hari/365;
        int sisahari = hari%365;
        
        System.out.println("Maka, totalnya adalah " +tahun +" tahun dan " +sisahari +" hari.");

        input.close();
    }
    
}
