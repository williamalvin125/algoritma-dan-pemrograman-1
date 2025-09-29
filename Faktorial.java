import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = 5;
        int fn = 1;
        int fn1 = 1;
        int fn2;
        System.out.print(fn +", " +fn1 +", ");
        for (int i=1; i<=n-2;i++){
            fn2 = fn+fn1;

            if(i==n-2){
                System.out.print(fn2);
            } else {
                System.out.print(fn2 +", ");
            }
            fn = fn1;
            fn1 = fn2;
        }

        input.close();
    }
}