import java.util.Scanner;

public class RekursifFibonacci {
    static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else {
            return (fibo(n-1) + fibo(n-2));
        }
    }
    public static void main(String[]args){
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Suku deret bilangan fibonacci: ");
        int n = scan.nextInt();
        System.out.print("Hasil bilangan fibonacci: ");

        for (i = 0; i < n; i++){
            System.out.print(fibo(j)+", ");
            j++;
        }

        System.out.println();
        System.out.println("Maka, output terbesar n adalah " +fibo(j-1));
    }
}