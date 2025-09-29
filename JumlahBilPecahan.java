import java.util.Scanner;

public class JumlahBilPecahan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai P : ");
        int p = input.nextInt();

        double b = 0.0;
        double n = 1.0;
        double Sn = 0.0;
        while (Sn < p) {
            double a = n/(n+1);
            b = a;
            Sn = Sn + b;
            if (Sn>p) {
                break;
            }
            n++;
        }
        System.out.println("Nilai terkecil n yang membuat Sn>P adalah " +n +" dan nilai Sn " +Sn);
        input.close();
    }
}