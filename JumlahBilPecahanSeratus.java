import java.util.Scanner;

public class JumlahBilPecahanSeratus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai P : ");
        int p = input.nextInt();

        double b = 0.0;
        double n = 0.0;
        double Sn = 0.0;
        for (n = 1.0; n<=100; n++){
            double a = n/(n+1);
            b = a;
            Sn = Sn + b;
            if (Sn>p){
                System.out.println("Nilai terkecil n yang membuat Sn>P adalah " +n +" dan nilai Sn " +Sn);
                return;
            }
            
        }
        System.out.print("P terlalu besar");

        input.close();
    }
}
