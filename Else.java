import java.util.Scanner;

public class Else{
    public static void main(String[] args) {
        System.out.println("Masukkan nilai IP : ");
        Scanner baca = new Scanner(System.in);
        double ip = baca.nextDouble();
        if (ip<2) {
            System.out.println("Belajar lebih rajin.");
        }
        else {
        System.out.println("Tingkatkan prestasi.");
        }
        baca.close();
    }
}