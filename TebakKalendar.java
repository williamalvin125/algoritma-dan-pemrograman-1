import java.util.Scanner;

public class TebakKalendar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan tahun : ");
        int tahun = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan bulan : ");
        String bulan = input.nextLine();
        System.out.print("Masukkan hari dalam bulan tersebut : ");  
        int q = input.nextInt();

        int h=0, m=0, j=0, k=0;
        switch (bulan) {
            case "januari" : case "februari" :
            j = tahun/100;
            k = (tahun%100) - 1;
        break;
            case "maret" : case "april" : case "mei" : case "juni" : case "juli" : case "agustus" : case "september" : case "oktober" : case "november" : case "desember" :
            j = tahun/100;
            k = tahun%100;
        break;
            default :
        }
        String BULAN = "ERROR";
        switch (bulan) {
            case "januari" :
            m = 13;
            BULAN = "Januari";
        break;
            case "februari" :
            m = 14;
            BULAN = "Februari";
        break;
            case "maret" :
            m = 3;
            BULAN = "Maret";
        break;
            case "april" :
            m = 4;
            BULAN = "April";
        break;
            case "mei" :
            m = 5;
            BULAN = "Mei";
        break;
            case "juni" :
            m = 6;
            BULAN = "Juni";
        break;
            case "juli" :
            m = 7;
            BULAN = "Juli";
        break;
            case "agustus" :
            m = 8;
            BULAN = "Agustus";
        break;
            case "september" :
            m = 9;
            BULAN = "September";
        break;
            case "oktober" :
            m = 10;
            BULAN = "Oktober";
        break;
            case "november" :
            m = 11;
            BULAN = "November";
        break;
            case "desember" :
            m = 12;
            BULAN = "Desember";
        break;
            default :
        }

        h = (q + (26*(m+1)/10) + k + k/4 + j/4 + 5*j)%7;

        String hari;
        switch (h){
            case 0 :
            hari = "Sabtu";
        break;
            case 1 : 
            hari = "Minggu";
        break;
            case 2 : 
            hari = "Senin";
        break;
            case 3 : 
            hari = "Selasa";
        break;
            case 4 : 
            hari = "Rabu";
        break;
            case 5 : 
            hari = "Kamis";
        break;
            case 6 : 
            hari = "Jumat";
        break;
            default :
            hari = "Error!";
        }

        System.out.println(q +" " +BULAN +" " +tahun +" merupakan hari " +hari);
        input.close();
    }
}