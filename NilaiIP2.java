import java.util.Scanner;

public class NilaiIP2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = input.nextInt();
        String[][] inputkode = new String[jumlahmatkul][3];
        int[][] inputsks = new int[jumlahmatkul][3];
        String[][] inputhuruf = new String[jumlahmatkul][3];
        System.out.println("Masukkan Kode MK, SKS, dan Nilai Huruf dari tiap mata kuliah");
        input.nextLine();
        for(int x=0;x<inputkode.length;x++){
            inputkode[x][0] = input.next();
        }
        for(int y=0;y<inputsks.length;y++){
            inputsks[y][1] = input.nextInt();
        }
        for(int z=0;z<inputhuruf.length;z++){
            inputhuruf[z][2] = input.next();
        }

        double ip = 0.0;
        for(int a=0;a<inputhuruf.length;a++){
        switch(inputhuruf[a][2]){
            case "A" :
            ip = 4.0;
            break;
            case "AB" :
            ip = 3.5;
            break;
            case "B" :
            ip = 3.0 ;
            break;
            case "C" :
            ip = 2.0;
            break;
            case "D" :
            ip = 1.0;
            break;
            case "E" :
            ip = 0.0;
            break;
            default :
            System.out.println("ERROR!");
        }
        
        for(int b=0;b<inputsks.length;b++){
            double sn = inputsks[b][1]*ip;
            Sn = sn;
        }


        System.out.println("==============================================");
        System.out.println("==================2023-Gasal==================");
        System.out.println("==============================================");
        System.out.println("|   Kode MK   |   SKS   |   Huruf   |   S*N  |");


        for(int x=0;x<inputkode.length;x++){
            System.out.print(inputkode[x][0] +" ");
        }
        for(int y=0;y<inputsks.length;y++){
            System.out.print(inputsks[y][1] +" ");
        }
        for(int z=0;z<inputhuruf.length;z++){
            System.out.print(inputhuruf[z][2] +" = " +Sn +" = " +ip);
        }

    

    }
    }
}