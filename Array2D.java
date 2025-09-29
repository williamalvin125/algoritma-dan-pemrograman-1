import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Array2D {
    public static void main(String[] args) {
        
        int [][] triangleArray = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4},
            {1, 2, 3},
            {1, 2},
            {1}
        };

        System.out.println(triangleArray.length);

        Scanner input = new Scanner(System.in);
        int [][] matrix = new int [2][2];
        System.out.println("Masukkan " +matrix.length +" baris dan " +matrix[0].length +" kolom");
        for (int baris = 0; baris<matrix.length; baris++) {
            for (int kolom = 0; kolom<matrix[baris].length; kolom++){
                matrix[baris][kolom] = input.nextInt();
            }
        }

        System.out.println();

        for (int baris = 0; baris<matrix.length; baris++) {
            for (int kolom = 0; kolom<matrix[baris].length; kolom++){
                System.out.print(matrix[baris][kolom] +" ");
            }
            System.out.println();
        }
        
        input.close();
    }
}