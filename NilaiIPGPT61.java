import java.util.Scanner;

public class NilaiIPGPT61 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = input.nextInt();
        String[][] inputkode = new String[jumlahmatkul][3];
        String[][] inputsks = new String[jumlahmatkul][3];
        String[][] inputhuruf = new String[jumlahmatkul][3];
        System.out.println("Masukkan Kode MK, SKS, dan Nilai Huruf dari tiap mata kuliah");

        for (int x = 0; x < jumlahmatkul; x++) {
            System.out.print(" ");
            inputkode[x][0] = input.next();

            System.out.print(" ");
            inputsks[x][1] = input.next();

            System.out.print(" ");
            inputhuruf[x][2] = input.next();
        }

        System.out.println();
        System.out.println("============================================================");
        System.out.println("=======================2023-GASAL===========================");
        System.out.println("============================================================");
        System.out.printf("| %-15s | %-7s | %-15s | %-8s |\n", "Mata Kuliah", "SKS", "Nilai Huruf", "S*N");
        System.out.println("============================================================");

        for (int a = 0; a < jumlahmatkul; a++) {
            String nilaiHuruf = inputhuruf[a][2];

            int sksMataKuliah = Integer.parseInt(inputsks[a][1]);

            System.out.printf("| %-15s | %-7s | %-15s  | %-8s |\n",
                    inputkode[a][0], inputsks[a][1], nilaiHuruf, (getBobotNilai(nilaiHuruf) * sksMataKuliah));
        }
    }

    // Fungsi untuk mendapatkan bobot nilai huruf
    private static double getBobotNilai(String huruf) {
        switch (huruf) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return -1.0; // Nilai huruf tidak valid
        }
    }
}
