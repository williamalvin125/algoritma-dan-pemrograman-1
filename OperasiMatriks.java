import java.util.Scanner;

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input matriks A
        System.out.print("Masukkan jumlah baris matriks A: ");
        int m = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int n = input.nextInt();
        System.out.println();
        int[][] A = inputMatriks("A", m, n);
        System.out.println();

        // Input matriks B
        System.out.print("Masukkan jumlah baris matriks B: ");
        int p = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int q = input.nextInt();
        System.out.println();
        int[][] B = inputMatriks("B", p, q);
        System.out.println();

        // Pilihan operasi
        System.out.println("Pilih operasi matriks:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();

        // Validasi ukuran matriks untuk operasi perkalian
        if (choice == 3 && n != p) {
            System.out.println("Operasi perkalian matriks tidak dapat dilakukan karena jumlah kolom matriks A tidak sama dengan jumlah baris matriks B.");
        } else {
            // Operasi matriks
            int[][] result;
            if (choice == 1) {
                result = Tambah_Matriks(A, B);
            } else if (choice == 2) {
                result = Kurang_Matriks(A, B);
            } else {
                result = Kali_Matriks(A, B);
            }

            // Menampilkan hasil
            System.out.println();
            System.out.println("Hasil Operasi Matriks:");
            printMatriks(result);
        }
    }

    // Method untuk menginput matriks
    public static int[][] inputMatriks(String namaMatriks, int baris, int kolom) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai matriks " + namaMatriks + ":");
        int[][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen matriks " + namaMatriks + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }

        return matriks;
    }

    // Method untuk penjumlahan matriks
    public static int[][] Tambah_Matriks(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int[][] hasil = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }

        return hasil;
    }

    // Method untuk pengurangan matriks
    public static int[][] Kurang_Matriks(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int[][] hasil = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hasil[i][j] = A[i][j] - B[i][j];
            }
        }

        return hasil;
    }

    // Method untuk perkalian matriks
    public static int[][] Kali_Matriks(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B.length;
        int q = B[0].length;
        int[][] hasil = new int[m][q];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return hasil;
    }

    // Method untuk menampilkan matriks
    public static void printMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
