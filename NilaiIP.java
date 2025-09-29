import java.util.Scanner;

public class NilaiIP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = input.nextInt();
        String[][] inputkode = new String[jumlahmatkul][3];
        String[][] inputsks = new String[jumlahmatkul][3];
        String[][] inputhuruf = new String[jumlahmatkul][3];
        System.out.println("Masukkan Kode MK, SKS, dan Nilai Huruf dari tiap mata kuliah");
        // input.nextLine();
        for(int x=0;x<inputkode.length;x++){
            inputkode[x][0] = input.next();
            System.out.println("[x][0]: "+ inputkode[x][0] +"\n");
        }
        for(int y=0;y<inputsks.length;y++){
            inputsks[y][1] = input.next();
            System.out.println("[y][1]: "+ inputkode[y][1]+"\n");
        }
        for(int z=0;z<inputhuruf.length;z++){
            inputhuruf[z][2] = input.next();
            System.out.println("[z][2]: "+ inputkode[z][2]+"\n");
        }

        double ip = 0.0;
        for (int a=0;a<inputhuruf.length;a++){
            System.out.print(inputhuruf[a][2]);
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

            }
            System.out.print("ip" + ip);

    }


        for(int A=0;A<inputkode.length;A++){
             System.out.print(inputkode[A][0] +" ");
         }
         for(int B=0;B<inputsks.length;B++){
             System.out.print(inputsks[B][1] +" ");
         }
         for(int C=0;C<inputhuruf.length;C++){
             System.out.print(inputhuruf[C][2] +" = " + ip);
         }

    

    }
    }
