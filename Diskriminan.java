import java.util.Scanner;

public class Diskriminan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("ax^2+bx+c=0");
        System.out.print("Masukkan nilai a : ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b : ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c : ");
        double c = input.nextDouble();
        
        double D, x1, x2;
        D = (Math.pow(b,2))- (4*a*c);
        x1 = (-b + Math.pow(D,0.5))/(2*a);
        x2 = (-b - Math.pow(D, 0.5))/(2*a);
        
        System.out.println("Maka, D adalah " +D);
        System.out.println("x1 = " +x1);
        System.out.println("x2 = " +x2);
        
        input.close();
    }
    
}
