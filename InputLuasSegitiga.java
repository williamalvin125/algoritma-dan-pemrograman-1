import java.util.Scanner;

public class InputLuasSegitiga {

    public static void main (String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai a : ");
    double a = input.nextDouble();
    System.out.print("Masukkan nilai b : ");
    double b = input.nextDouble();
    System.out.print("Masukkan nilai c : ");
    double c = input.nextDouble();

    double y = -c/b; //x=0
    double x = -c/a; //y=0

    double L = x*y/2; L = L>0 ? L:-L;
    System.out.println("Maka " +L);
    
    input.close();


}
}