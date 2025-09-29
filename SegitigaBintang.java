import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int n = input.nextInt();
        System.out.println();

        for(int i=0; i<=n; i++){
            for (int j=0; j<=i; j++){
                if (j==0||j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=0; i<=n; n--){
            for (int j=0; j<=n; j++){
                if (j==0||j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        input.close();
    }
}