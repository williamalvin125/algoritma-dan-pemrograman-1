import java.util.Scanner;

public class Nestedif{
    public static void main(String[] args) {
        System.out.println("Ingin cek program Bilangan, IP atau Nilai Angka? \n1. Bilangan kecil \n2. IP \n3. Nilai Angka");
        Scanner baca = new Scanner(System.in);
        int tugas = baca.nextInt();
        if (tugas==1) {
            System.out.println("Bilangan kecil : ");
            int bil = baca.nextInt();
            if (bil>10){
                System.out.println("Ini bukan bilangan kecil.");
            }
            System.out.println("Terima kasih.");
        }
        else if (tugas==2) {
            System.out.println("Masukkan nilai IP : ");
            double ip = baca.nextDouble();
            if (ip<2){
                System.out.println("Belajar lebih giat.");
            }
            else{
                System.out.println("Tingkatkan prestasi.");
            }
        }
        else{
            System.out.println("Masukkan nilai : ");
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
                System.out.println("Nilai Anda ");
        }
            else{
                System.out.println("Nilai Anda E");
        }
        }
        baca.close();
    }
}