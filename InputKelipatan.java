import java.util.Scanner;

public class InputKelipatan {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Carilah banyak anggota kelipatan 2,3, dan 5 dari n!");
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();

        int dua = nilai/2;
        int tiga = nilai/3 - nilai/6;
        int lima = nilai/5 - nilai/10 - nilai/15;
        int tigapuluh = nilai/30;
        int total = dua + tiga + lima + tigapuluh;

        if (nilai>0){
            System.out.println("Maka, banyaknya anggota adalah " +total);
        }

        else{
            System.out.println("ERROR!");
        }

        input.close();
    }
}