import java.util.Scanner;

public class MatriksNestedLoop {

    public static void main(String[] args) {
        
        System.out.println("MULTIPLICATION TABLE");
        
        Scanner input = new Scanner(System.in);
        
        int m,n;
        System.out.print("Masukkan ukuran baris matriks : ");
        m = input.nextInt();
        System.out.print("Masukkan ukuran kolom matriks : ");
        n = input.nextInt();
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
        input.close();
    }
    
}

