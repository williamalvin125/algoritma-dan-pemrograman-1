import java.util.Scanner;

public class SwitchInt {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan ke : ");
        int bulan = input.nextInt();

        String bulanstring;
        switch (bulan) {
            case 1 : bulanstring = "Januari.";
            break;
            case 2 : bulanstring = "Februari.";
            break;
            case 3 : bulanstring = "Maret.";
            break;
            case 4 : bulanstring = "April.";
            break;
            case 5 : bulanstring = "Mei.";
            break;
            case 6 : bulanstring = "Juni.";
            break;
            case 7 : bulanstring = "Juli.";
            break;
            case 8 : bulanstring = "Agustus.";
            break;
            case 9 : bulanstring = "September.";
            break;
            case 10 : bulanstring = "Oktober.";
            break;
            case 11 : bulanstring = "November.";
            break;
            case 12 : bulanstring = "Desember.";
            break;
            default : bulanstring = "Tidak ada.";


        }

        System.out.println(bulanstring);

        input.close();
    }
}