import java.util.Scanner;

public class If{
    public static void main(String[] args) {
        System.out.println("Bilangan kecil");
        Scanner baca = new Scanner(System.in);
        int bil = baca.nextInt();
        if (bil>=10) {
            System.out.println("Ini bukan bilangan kecil.");
        }
        System.out.println("Terima kasih.");

        baca.close();
    }
}