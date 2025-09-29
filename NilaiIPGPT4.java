import java.util.Scanner;

public class NilaiIPGPT4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = input.nextInt();
        String[][] inputkode = new String[jumlahmatkul][3];
        String[][] inputsks = new String[jumlahmatkul][3];
        String[][] inputhuruf = new String[jumlahmatkul][3];
        System.out.println("Masukkan Kode MK, SKS, dan Nilai Huruf dari tiap mata kuliah");

        for (int x = 0; x < jumlahmatkul; x++) {
            System.out.print("Kode MK: ");
            inputkode[x][0] = input.next();

            System.out.print("SKS: ");
            inputsks[x][1] = input.next();

            System.out.print("Nilai Huruf: ");
            inputhuruf[x][2] = input.next();
        }

        System.out.println("=====================================================");
        System.out.println("Mata Kuliah \t SKS \t Nilai Huruf \t SKS * Nilai Huruf");
        System.out.println("=====================================================");

        for (int a = 0; a < jumlahmatkul; a++) {
            String nilaiHuruf = inputhuruf[a][2];

            int sksMataKuliah = Integer.parseInt(inputsks[a][1]);

            System.out.println(
                    inputkode[a][0] + "\t\t\t" + inputsks[a][1] + "\t\t" + nilaiHuruf + "\t\t"
                            + (getBobotNilai(nilaiHuruf) * sksMataKuliah));
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