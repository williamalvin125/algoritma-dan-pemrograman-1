// Import untuk scanner
import java.util.Scanner;

/* package adalah folder kumpulan program java
import adalah impor yang berfungsi untuk menentukan nilai */

public class BelajarJava {
// class adalah deklarasi nama program diikuti {}

// main untuk menjalankan program
    public static void main(String[] args) {
// Rumus statement : System.out.println(); dimana setiap statement diakhiri ;
        System.out.println("Hello World");

        var x=5;
        var y=10;
        var z=x+y;
        System.out.println(z);

//Huruf besar dan kecil dibedakan (case sensitive)
        String jenisKelamin ="Laki-Laki";
//Menulis statement dari variabel tidak boleh pakai ""
        System.out.println(jenisKelamin);

//Membuat Variabel menggunakan rumus : tipedata namaVariabel;
        String nama, alamat;
        int usia;
        double tinggi;
// Variabel dapat dimasukkan langsung atau manual
// Variabel int (integer) dan double (bilangan riil) tidak boleh pakai ""
// Bilangan desimal pake tanda titik, bukan koma
        nama="Ali";
        alamat="Surabaya";
        usia=38;
        tinggi=168.2;
// "Nama saya: " adalah STRING + nama adalah VARIABEL
        System.out.println("Nama saya: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Usia: "+usia);
        System.out.println("Tinggi: "+tinggi);
        
        System.out.print("Rumah Rumah");
        System.out.println("Rumah Rumah");
// println berfungsi menambah baris tiap kalimat itu

        int L, p=10, l=12;
        L = p*l;
        System.out.println("Luas Persegi Panjang = " +L);

// Spasi pada variabel harus diubah dengan tanda _
        double Kel_ling, Luas_ling, Ï€=3.14, r=7;
        Kel_ling = 2*Ï€*r;
        Luas_ling = Ï€*r*r;
        System.out.println("Keliling Lingkaran = " +Kel_ling +" cm");
        System.out.println("Luas Lingkaran = " +Luas_ling +" cm");
        
//variabel yang digunakan adalah variabel terakhir, posisi baris sangat penting
        double A=60, B=30, C=15, D, E;
        D = A+B; // D = 60 + 30 = 90
        System.out.println("Nilai D lama adalah "+D);
        A = C; // A = 15
        D = A+B; // D = 15 + 30 = 45
        E = D+A; // E = 45 + 15 = 60
        System.out.println("Hasil D adalah "+D +", Hasil A adalah "+A +", Hasil E adalah "+E );

// format Scanner (nama scanner) = new Scanner (System.in);
    System.out.println("Masukkan jari-jari lingkaran = ");
    Scanner input = new Scanner(System.in);//Dek. Variabel
// masukkan variabel ke (nama scanner).next(variabel)(), untuk membuat input
    double jari_jari = input.nextDouble();
    double LuasLingkaran, PHI=3.14;
    LuasLingkaran = PHI*jari_jari*jari_jari;
    
    System.out.println("Luas lingkaran = "+LuasLingkaran);
    input.close();
// mengakhiri input dengan (nama scanner).close();
    
// swap menggunakan variabel bantu yang didefinisikan terlebih dahulu
        System.out.println("Jika 10 dan 15 dibalik.");
        int AA=10, BB=15, CC;
        CC = AA; AA = BB; BB = CC;
        System.out.println("Maka, "+AA +" dan "+BB);
// int tidak boleh integer dioperasikan dengan double, phi tidak dapat diubah
// % digunakan untuk sisa bagi 20%3 sisa 2
// i(+-*/%)=j artinya i = i(+-*/%)j
/* 
masukkan variable i=1, 
++var int j = ++1 artinya i=2, j=2
var++ int j = i++ artinya i=2, j=1
*/
// Math.pow(a,b) menyatakan a^b dan Math.sqrt menyatakan akar
    System.out.println("Berapa akar 16 dan 4^2?");
    System.out.println(Math.pow(4, 2));


    }


}

