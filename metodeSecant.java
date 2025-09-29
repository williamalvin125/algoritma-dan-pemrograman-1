import java.util.Scanner;
import java.lang.Math;

public class metodeSecant {

    public static double f(double x){
        double fx = (Math.pow(x,5)) + (3*x*x) - (5*x) -(8+39);
        return fx;
    }

    public static double Secant(double x0, double x1, double e){
        double x2=0;
        while (Math.abs(f(x2))>e) {
            x2 = (x1) - ((f(x1))*(x0-x1)/(f(x0)-f(x1)));
            x0 = x1;
            x1 = x2;
        }
        return x2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x0 = 2.0;
        double x1 = 3.0;
        System.out.print("Masukkan epsilon : ");
        double e = input.nextDouble();
        double hasil = Secant(x0,x1,e);
        System.out.println(hasil);

        input.close();
    }
}