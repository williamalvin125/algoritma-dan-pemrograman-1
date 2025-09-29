import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai sisi : ");
        double sisi = input.nextDouble();
        System.out.print("Masukkan nilai tinggi : ");
        double tinggi = input.nextDouble();

        System.out.println("Ingin menghitung apa?");
        System.out.println("1. Volume Kubus \n2. Volume Prisma Segiempat \n3. Prisma segitiga \n4. Tabung");
        int pilihan = input.nextInt();

        double volume=0.0;
        switch(pilihan){
            case 1: case 2:
            volume = sisi * sisi * tinggi;
            break;
            case 3:
            double luas = Math.sqrt(sisi)-Math.sqrt(sisi/2);
            volume = Math.sqrt(luas) * tinggi;
            break;
            case 4:
            volume = Math.PI * sisi * sisi * tinggi;
            break;
            default:
            System.out.println("ERROR!");

            input.close();
        }

        System.out.println("Maka volumenya adalah " +volume);
    }
}