import java.util.Scanner;

public class NilaiIPGPT2 {
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
        System.out.println("Mata Kuliah \t SKS \t Nilai Huruf \t IP");
        System.out.println("=====================================================");

        for (int a = 0; a < jumlahmatkul; a++) {
            switch (inputhuruf[a][2]) {
                case "A":
                    inputhuruf[a][2] = "4.0";
                    break;
                case "AB":
                    inputhuruf[a][2] = "3.5";
                    break;
                case "B":
                    inputhuruf[a][2] = "3.0";
                    break;
                case "C":
                    inputhuruf[a][2] = "2.0";
                    break;
                case "D":
                    inputhuruf[a][2] = "1.0";
                    break;
                case "E":
                    inputhuruf[a][2] = "0.0";
                    break;
                default:
                    inputhuruf[a][2] = "Nilai huruf tidak valid";
                    break;
            }

            double ipMataKuliah = Double.parseDouble(inputhuruf[a][2]);
            int sksMataKuliah = Integer.parseInt(inputsks[a][1]);
            double ip = ipMataKuliah * sksMataKuliah;

            System.out.println(inputkode[a][0] + "\t\t\t" + inputsks[a][1] + "\t\t" + inputhuruf[a][2] + "\t\t" + ip);
        }
    }
}