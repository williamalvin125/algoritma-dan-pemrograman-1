import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai P : ");
        int p = input.nextInt();

        double b = 0.0;
        double n = 1.0;
        double Sn = 0.0;
        while(n>=1){
            double a = n/(n+1);
            b = a;
            Sn = Sn + b;
            if (Sn>p){
                break;
            }
            n++;
        }

        while(n>100){
            System.out.println("Nilai P terlalu besar. Nilai terkecil n yang tidak membuat Sn>P adalah " +n +" dan nilai Sn " +Sn);
            break;
        }

        while(n<=100){
            System.out.println("Nilai terkecil n yang membuat Sn>P adalah " +n +" dan nilai Sn " +Sn);
            break;
        }

        input.close();
    }
}
