import java.util.Scanner;

public class NilaiIPGPT {
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

        double totalBobot = 0.0;
        double totalSKS = 0.0;

        for (int a = 0; a < jumlahmatkul; a++) {
            switch (inputhuruf[a][2]) {
                case "A":
                    totalBobot += 4.0 * Integer.parseInt(inputsks[a][1]);
                    break;
                case "AB":
                    totalBobot += 3.5 * Integer.parseInt(inputsks[a][1]);
                    break;
                case "B":
                    totalBobot += 3.0 * Integer.parseInt(inputsks[a][1]);
                    break;
                case "C":
                    totalBobot += 2.0 * Integer.parseInt(inputsks[a][1]);
                    break;
                case "D":
                    totalBobot += 1.0 * Integer.parseInt(inputsks[a][1]);
                    break;
                case "E":
                    totalBobot += 0.0 * Integer.parseInt(inputsks[a][1]);
                    break;
                default:
                    System.out.println("Nilai huruf tidak valid");
                    break;
            }
            totalSKS += Integer.parseInt(inputsks[a][1]);
        }

        double ip = totalBobot / totalSKS;
        System.out.println("Indeks Prestasi (IP): " + ip);
    }
}