import java.util.Scanner;

public class SwitchOr {

    public static void main(String[] args) {
    int jmlhari = 0;

    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan tahun : ");
    int tahun = input.nextInt();
    System.out.print("Masukkan bulan : ");
    int bulan = input.nextInt();


    switch(bulan) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: jmlhari = 31;
        break;
        case 4: case 6: case 9: case 11: jmlhari = 30;
        break;
        case 2:
            if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0))
            jmlhari = 29;
            else
            jmlhari = 28;
        break;
        default: System.out.println("Error!");
    }

    System.out.println(jmlhari);

    input.close();

}
}