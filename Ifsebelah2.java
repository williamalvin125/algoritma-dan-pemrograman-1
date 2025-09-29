import java.util.Scanner;

public class Ifsebelah2{
    public static void main(String[] args) {
        System.out.print("Masukkan nilai bilangan antara 0-100 : ");
        Scanner baca = new Scanner(System.in);
        int bilangan = baca.nextInt();
        if (bilangan<0){
            System.out.println("Nilai terlalu kecil");
        }
        if (bilangan<=100){
            System.out.println("Nilai sesuai");
        }
        if (bilangan >100)
            System.out.println("Nilai terlalu besar");

            baca.close();
    }
}