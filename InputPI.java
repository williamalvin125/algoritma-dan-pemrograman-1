import java.util.Scanner;
import java.lang.Math;

public class InputPI {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jari- jari : ");
        int jarijari = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = input.nextInt();
        
        System.out.print("Mau pilih lingkaran, tabung, kerucut, atau bola? ");
        input.nextLine();
        String pilihan = input.nextLine();

        switch (pilihan) {
            case "lingkaran" :
            System.out.print("Silahkan pilih program yang ingin dijalankan \n1. Menghitung Luas\n2. Menghitung Keliling\nProgram yang dipilih adalah program nomor ");
            int pilihlingkaran = input.nextInt();
                switch (pilihlingkaran) {
                    case 1 :
                    double luasLing = Math.PI * jarijari * jarijari;
                    System.out.println("Luas dari lingkaran tersebut adalah " +luasLing +" cm^2");
                break;
                    case 2 :
                    double kelilingLing = Math.PI * 2 * jarijari;
                    System.out.println("Keliling dari lingkaran tersebut adalah " +kelilingLing +" cm^2");
                break;
                    default :
                    System.out.println("Perintah tidak ditemukan");
                }
        break;

            case "tabung" :
            System.out.print("Silahkan pilih program yang ingin dijalankan\n1. Menghitung volume \n2. Menghitung luas alas \n3. Menghitung luas selimut \n4. Menghitung luas permukaan\nProgram yang dipilih adalah program nomor ");
            int pilihTabung = input.nextInt();
                switch (pilihTabung) {
                    case 1 :
                    double volumeTab = Math.PI * jarijari * jarijari * tinggi;
                    System.out.println("Volume dari tabung tersebut adalah " +volumeTab +" cm^3");
                break;
                    case 2 :
                    double luasAlasTab = Math.PI * jarijari * jarijari;
                    System.out.println("Luas alas dari tabung tersebut adalah " +luasAlasTab +" cm^2");
                break;
                    case 3 :
                    double luasSelimutTab = Math.PI * jarijari * tinggi * 2;
                    System.out.println("Luas selimut dari tabung tersebut adalah " +luasSelimutTab +" cm^2");
                break;
                    case 4 :
                    double luasPermukaanTab = (Math.PI * jarijari * 2) * (jarijari + tinggi);
                    System.out.println("Luas permukaan dari tabung tersebut adalah " +luasPermukaanTab +" cm^2");
                break;
                    default :
                    System.out.println("Perintah tidak ditemukan");
                }
        break;

            case "kerucut" :
            System.out.print("Silahkan pilih program yang ingin dijalankan\n1. Menghitung volume \n2. Menghitung luas alas \n3. Menghitung luas selimut \n4. Menghitung luas permukaan\nProgram yang dipilih adalah program nomor ");
            int pilihKerucut = input.nextInt();
                switch (pilihKerucut) {
                    case 1 :
                    double volumeKer = Math.PI * jarijari * jarijari * tinggi / 3;
                    System.out.println("Volume dari kerucut tersebut adalah " +volumeKer +" cm^3");
                break;
                    case 2 :
                    double luasAlasKer = Math.PI * jarijari * jarijari;
                    System.out.println("Luas alas dari kerucut tersebut adalah " +luasAlasKer +" cm^2");
                break;
                    case 3 :
                    double miring = (tinggi*tinggi) + (jarijari*jarijari);
                    double apotema = Math.sqrt(miring);
                    double luasSelimutKer = Math.PI * jarijari * apotema;
                    System.out.println("Luas selimut dari kerucut tersebut adalah " +luasSelimutKer +" cm^2");
                break;
                    case 4 :
                    double hipotenusa = (tinggi*tinggi) + (jarijari*jarijari);
                    double s = Math.sqrt(hipotenusa);
                    double luasPermukaanKer = Math.PI * jarijari * (s + jarijari);
                    System.out.println("Luas permukaan dari kerucut tersebut adalah " +luasPermukaanKer +" cm^2");
                break;
                    default :
                    System.out.println("Perintah tidak ditemukan");
                }
        break;

            case "bola" :
            System.out.print("Silahkan pilih program yang ingin dijalankan\n1. Menghitung volume \n2. Menghitung luas permukaan\nProgram yang dipilih adalah program nomor ");
            int pilihBola = input.nextInt();
                switch (pilihBola) {
                    case 1 :
                    double volumeBol = Math.PI * jarijari * jarijari * jarijari * 4 / 3;
                    System.out.println("Volume dari bola tersebut adalah " +volumeBol +" cm^3");
                break;
                    case 2 ://
                    double luasPermukaanBol = Math.PI * jarijari * jarijari * 4;
                    System.out.println("Luas permukaan dari kerucut tersebut adalah " +luasPermukaanBol +" cm^2");
                break;
                    default :
                    System.out.println("Perintah tidak ditemukan");
                }
        break;

            default :
            System.out.println("Perintah tidak ditemukan");
        }

        input.close();
    }
}