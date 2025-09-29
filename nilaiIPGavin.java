import java.util.Scanner;

public class NilaiIPGavin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = input.nextInt();
        String[] inputkode = new String[jumlahmatkul];
        String[] inputsks = new String[jumlahmatkul];
        String[] inputhuruf = new String[jumlahmatkul];
        System.out.println("Masukkan Kode MK, SKS, dan Nilai Huruf dari tiap mata kuliah");
        input.nextLine();
        for(int x=0;x<inputkode.length;x++){
            inputkode[x] = input.next();
        }
        for(int y=0;y<inputsks.length;y++){
            inputsks[y] = input.next();
        }
        for(int z=0;z<inputhuruf.length;z++){
            inputhuruf[z] = input.next();
        }
        for (int i=0;i<jumlahmatkul;i++) {
            System.out.println(inputkode[i]);
            System.out.println(inputsks[i]);
            System.out.println(inputhuruf[i]);
        }
    }
}