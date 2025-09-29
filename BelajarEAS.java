public class BelajarEAS {
    public static void Array() {

        String[] arr = { "Nama1", "Nama2", "Nama3" };

        String[][] arrNama = {
                { "Anies", "Imin" },
                { "Prabowo", "Gibran" },
                { "Ganjar", "Mahfud" }
        };
        // CARA MENGISI KE ARRAY

        System.out.println(arrNama[0][1]);

        System.out.println(arrNama.length);

        // NGEPRINT ARRAY DGN INDEX
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // NGEPRINT ARRAY TANPA INDEX
        for (String strings : arr) {
            System.out.println(strings);
        }

        for (int i = 0; i < arrNama.length; i++) { // BARIS
            for (int j = 0; j < arrNama[i].length; j++) { // KOLOM
                System.out.println(arrNama[i][j]);
            }
        }
    }

    public static void sayHello() {
        System.out.println("Halo");
    }

    public static int giveMoney(int uang) {
        return uang;
    }

    public static int recursive(int a) {
        System.out.println(a);
        return recursive(a);
    }

    public static int func(int n) {
        if (n == 0) {
            return 1;
        }
        return func(n - 1) + 3;
    }

    public static void No3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama Pegawai: ");
        String nama = input.next();
        System.out.println("Masukan Golongan: ");
        int golongan = input.nextInt();
        System.out.println("Masukan Jam Kerja: ");
        int jamKerja = input.nextInt();

        double upahHarian = 0;
        double jamLembur = (jamKerja - 8);
        double upahLembur = 0;

        if (golongan == 1) {
            upahHarian = 22500;
            upahLembur = 4000;
        } else {
            upahHarian = 26000;
            upahLembur = 5500;
        }

        if (jamLembur > 0) {
            double totalLembur = jamLembur * upahLembur;
            System.out.println(upahHarian + totalLembur);
        }
    }

    public static void Halo(String[] args) {
        // MEMBUAT ARRAY 3X4
        // int[][] arr = new int[3][4];

        // Scanner input = new Scanner(System.in);

        // System.out.println("Input Matrix 3x4: ");

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = input.nextInt();
        // System.out.print("\t");
        // }
        // System.out.println();
        // }

        int[][] arr = {
                { 1, 2, 3, 4 },
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2, }
        };

        for (int i = 0; i < arr[0].length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                temp += arr[j][i];
            }
            System.out.println(temp);
        }
    }

    public static void Mbuh(String[] args) {
        float[] Arr = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F,
                6.0F, 7.0F, 8.0F, 9.0F, 10.0F };

        System.out.println(Arr[0]);

        Arr[Arr.length - 1] = 100.0F;

        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }

    public static void NamaMethod() {
        System.out.println("Method 1");
    }

    public static void NamaMethod(String nama) {

    }

    public static void main(String[] args) {
        var temp = 0.0;
        for (double i = 1; i <= 20; i++) {
            temp = temp + (i / (i + 1));
            System.out.print(i + "\t");
            System.out.print(temp);
            System.out.println();
        }
        System.out.println(1 / (1 + 1));
        System.out.println(temp);
    }
}