import java.util.Scanner;

public class KelipatanBil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan a : ");
        int a = input.nextInt();
        System.out.println("Masukkan b : ");
        int b = input.nextInt();

        int c = a%b;
        if (c == 0) {
            System.out.println("Ya");
        }
        else
        {
            System.out.println("Tidak");
        }
        input.close();    
        }
    }
