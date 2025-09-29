// wajib memasukkan import java.util.Scanner
import java.util.Scanner;//Deklarasi untuk input melalui keyboard public class InputData {

public class GeometriInput {

    public static void main(String[] args) {
    System.out.println("Nama: William Alvin Lidjaja\nNRP: 5002231139\n\n");
    
    double Llingkaran, Lsegitiga, Lpermukaanbalok, Vbalok, Lpermukaanbola, Vbola, Lselimuttabung, Lpermukaantabung, Lpermukaantabungtanpatutup, Vtabung,
            phi=3.14, r=7, a=50, t=21, p=20, l=15;
           Llingkaran = phi*r*r; Lsegitiga =a*t/2; Lpermukaanbalok =2*(p*l+p*t+l*t); Vbalok =p*l*t;
           Lpermukaanbola = 4*phi*r*r; Vbola = 4/3*phi*r*r*r; Lselimuttabung = 2*phi*r*t; Lpermukaantabung = 2*phi*r*(r+t);
           Lpermukaantabungtanpatutup = phi*r*(r+2*t); Vtabung = phi*r*r*t;
    
    System.out.println("1. Tentukan luas lingkaran jika diketahui jari-jarinya = 7 cm");
    System.out.println("Diketahui :");
    System.out.println("phi = 3,14 cm");
    System.out.println("r = 7 cm");
    System.out.println("maka Luas lingkaran = " +Llingkaran +" cm^2\n");
    
    System.out.println("2. Tentukan luas segitiga abc (siku-siku) jika diketahui alasnya 50cm dan tingginya 21cm!");
    System.out.println("Diketahui :");
    System.out.println("a = 50 cm");
    System.out.println("t = 21 cm");
    System.out.println("maka Luas segitiga = " +Lsegitiga +" cm^2\n");

    System.out.println("3.Tentukan luas permukaan dan volume balok yang panjangnya 20 cm, lebarnya 15cm, tingginya 21 cm!");
    System.out.println("Diketahui :");
    System.out.println("p = 20 cm");
    System.out.println("l = 15 cm");
    System.out.println("t = 21 cm");
    System.out.println("maka,");
    System.out.println("Luas permukaan balok = " +Lpermukaanbalok +" cm^2");
    System.out.println("Volume balok = " +Vbalok +" cm^3\n");
    
    System.out.println("4.Tentukan luas permukaan dan volume bola yang panjang jari-jarinya 7 cm!");
    System.out.println("Diketahui :");
    System.out.println("r = 7 cm");
    System.out.println("phi = 3,14 cm");
    System.out.println("maka,");
    System.out.println("Luas permukaan bola = "+Lpermukaanbola +" cm^2");
    System.out.println("Volume bola = " +Vbola +" cm^3\n");
    
    System.out.println("5.Tentukan luas permukaan dan volume tabung yang panjang jari-jarinya 7 cm dan tingginya 21 cm!");
    System.out.println("Diketahui:");
    System.out.println("r = 7 cm");
    System.out.println("phi = 3,14 cm");
    System.out.println("t = 21 cm");
    System.out.println("maka,");
    System.out.println("Luas selimut tabung = "+Lselimuttabung +" cm^2");
    System.out.println("Luas permukaan tabung = "+Lpermukaantabung +"cm^2");
    System.out.println("Luas permukaan tabung tanpa tutup = "+Lpermukaantabungtanpatutup +"cm^2");
    System.out.println("Volume tabung = " +Vtabung +" cm^3\n");
    
// format Scanner (nama scanner) = new Scanner (System.in);
    System.out.println("Masukkan jari-jari lingkaran = ");
    Scanner input = new Scanner(System.in);//Dek. Variabel
// masukkan variabel ke (nama scanner).next(variabel)(), untuk membuat input
    double jari_jari = input.nextDouble();
   
    double LuasLingkaran, PHI=3.14;
    LuasLingkaran = PHI*jari_jari*jari_jari;
    System.out.println("Luas lingkaran = "+LuasLingkaran+"\n");
    
    //SEGITIGA
    
    System.out.println("Masukkan panjang alas = ");
    double PanjangAlas = input.nextDouble();
    
    System.out.println("Masukkan tinggi segitiga = ");
    double TinggiSegitiga = input.nextDouble();

// mengakhiri input dengan (nama scanner).close();
    input.close();
    
    double LuasSegitiga;
    LuasSegitiga = PanjangAlas*TinggiSegitiga/2;
    System.out.println("Luas segitiga adalah = " +LuasSegitiga);
    
    }
    
}
