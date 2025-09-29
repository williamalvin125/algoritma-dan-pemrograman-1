import java.util.Scanner;

public class ProgramHitungDigitScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

                    System.out.print("Masukkan angka 1-9999: ");
                    int angka = input.nextInt();

                    int a = (angka/1000)%10;
                    int b = (angka/100)%10;
                    int c = (angka/10)%10;
                    int d = (angka/1)%10;
                    int e = a + b + c + d;

                    if (angka>=1 && angka<=9999) {
                    System.out.println(e);
                }

                else {
                    System.out.println("ERROR!");
                } 

                input.close();
    }
}