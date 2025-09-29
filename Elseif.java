import java.util.Scanner;

public class Elseif{
    public static void main(String[] args) {
        System.out.println("Masukkan nilai : ");
        Scanner baca = new Scanner(System.in);
        int nilai = baca.nextInt();
        if (nilai > 80) {
            System.out.println("Nilai Anda A");
        }
        else if (nilai > 70) {
            System.out.println("Nilai Anda AB");
        }
        else if (nilai > 60) {
            System.out.println("Nilai Anda B");
        }
        else if (nilai > 55) {
            System.out.println("Nilai Anda BC");
        }
        else if (nilai > 50) {
            System.out.println("Nilai Anda C");
        }
        else if (nilai > 40) {
            System.out.println("Nilai Anda D");
        }
        else{
        System.out.println("Nilai Anda E");
        }
        baca.close();
    }
}