import java.util.Scanner;

public class penjualansepedamotor{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("SELAMAT DATANG DI WILLIAM STORE :");
        System.out.println("Silahkan mengisi inputan berikut.");
        System.out.print("Jenis Sepeda Motor : ");
        String jenis = input.nextLine();
        System.out.print("Harga Sepeda Motor : ");
        int harga = input.nextInt();
        System.out.print("Jumlah Pembelian : ");
        int jumlah = input.nextInt();

        System.out.println();
        System.out.println("TRANSAKSI PEMBELIAN : ");
        if(jumlah==1){
            System.out.println("Transaksi berhasil. Anda telah membeli " +jumlah +" buah motor berjenis " +jenis +" seharga Rp." +harga);
        }
        else if(jumlah>=2 && jumlah<=5){
            double diskon = harga*jumlah - (harga*jumlah*0.05);
            System.out.println("Selamat! Anda mendapatkan diskon 5%. Anda telah membeli " +jumlah +" buah motor berjenis " +jenis +"seharga Rp." + diskon);
        }
        else if(jumlah>=6 && jumlah<=10){
            double diskon = harga*jumlah - (harga*jumlah*0.075);
            System.out.println("Selamat! Anda mendapatkan diskon 7.5%. Anda telah membeli " +jumlah +" buah motor berjenis " +jenis +"seharga Rp." + diskon);
        }
        else if(jumlah>10){
            double diskon = harga*jumlah - (harga*jumlah*0.1);
            System.out.println("Selamat! Anda mendapatkan diskon 10%. Anda telah membeli " +jumlah +" buah motor berjenis " +jenis +"seharga Rp." + diskon);
        }
        else{
            System.out.println("error.");
        }
    }
}