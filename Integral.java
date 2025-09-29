import java.util.Scanner;

public class Integral {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Batas kiri a : ");
        double a = input.nextDouble();
        System.out.print("Batas kanan b : ");
        double b = input.nextDouble();
        
        double n = 10;
        double deltax = (b-a)/n;

        double jumlah = 0.0;
        for (double i=a; i<b; i+=deltax){
            double L = (i*i+1)*deltax;
            jumlah = jumlah + L;
        }

        System.out.println(jumlah);
        input.close();
    }
}