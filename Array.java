import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        int[] angka = {15, 25, 30, 10, 12, 23, 42, 233, 133 };
        for(int i : angka) {
            if(i%2 == 0){
            System.out.print(i +" ");
            }
        }
        
        //j=0,j++;
        //i = angka2[j];

        System.out.println();

        int[] ANGKA = new int[3];
        ANGKA[0] = 15;
        ANGKA[1] = 25;
        ANGKA[2] = 30;
        for(int j : ANGKA) {
            System.out.print(j + " ");
        }
        for(int I=0; I<ANGKA.length;I++){
            System.out.print(angka[I] +" ");
        }

        System.out.println();

        String[] nama = {"Gavin", "Mafto", "William"};
        for(String A : nama) {
            System.out.println(A + " ");
        }

        System.out.println();

        //Input dapat berupa panjang array, atau isi array dengan format panjang array(spasi)isi array,...
        System.out.print("Masukkan panjang array : ");
        Scanner input = new Scanner(System.in);
        int angkainput = input.nextInt();
        int[] inputangka = new int[angkainput];
        for(int z=0;z<inputangka.length;z++){
            System.out.print("Masukkan array ke-" +z +" = ");
            inputangka[z] = input.nextInt();
        }
        System.out.println();
        for(int z: inputangka){
            System.out.print(z +" ");
        }

        System.out.println();
        System.out.println();

        int[]arrayA = {7,4,1,3,5,1,3,13,131};
        int[]arrayB = new int[3];
        System.arraycopy(arrayA,0,arrayB,0,3);
        for(int i:arrayB){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println();

        int[]array = {7,4,1,3,5,1,3,13,131};
        int[]array2 = new int[3];
        int[]array3 = new int[5];
        int[]array4 = new int[4];
        //array 2 copy array 1 dari data ke 0 yang dimasukkan dari data ke-0 sampai ke-2(length banyak data yg dibaca) dengan panjang matriks 3
        System.arraycopy(array,0,array2,0,3);
        //array 3 copy array 1 dari data ke 2 yang dimasukkan dari data ke-2 sampai ke-4(length banyak data yg dibaca) dengan panjang matriks 5
        System.arraycopy(array,2,array3,2,3);
        System.arraycopy(array,1,array4,0,2);
        for(int i:array){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i:array2){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i:array3){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i:array4){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println();

        int[] ARRAY ={7,4,1,3,5,1,3,13,131};
        int[] ARRAY2 = new int[ARRAY.length-1];
        System.out.println("Masukkan indeks array yang ingin dihapus.");
        int W = input.nextInt();
        System.arraycopy(ARRAY, 0, ARRAY2, 0, W);
        System.arraycopy(ARRAY, W+1, ARRAY2, W, ARRAY.length-W-1);
        System.out.println();

        System.out.println("ARRAY : ");
        for (int ww:ARRAY){
            System.out.print(ww +" ");
        }

        System.out.println();
        System.out.println("ARRAY SUDAH DIHAPUS : ");
        for (int w:ARRAY2){
            System.out.print(w +" ");
        }

    }
}