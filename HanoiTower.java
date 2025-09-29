import java.util.Scanner;
public class HanoiTower { 

    static int i = 1;

    public static void hanoi(int n, char Asal, char Bantu, char Tujuan){
        if (n == 1){
            System.out.println("Langkah ke "+i+++", pindahkan piringan ke "+n+" dari "+Asal+" ke "+Tujuan);
        }
        else {hanoi(n-1, Asal, Tujuan, Bantu);
            System.out.println ("Langkah ke "+i+++", pindahkan piringan ke "+n+" dari "+Asal+" ke "+Tujuan);
            hanoi(n-1, Bantu, Asal, Tujuan) ;
        }
    }

    public static void main(String[] args) {
        Scanner var = new Scanner (System.in);
        System.out.print ("Banyaknya piringan = ");
        int n = var.nextInt ();
        hanoi(n, 'A', 'B', 'C');
    }
        
    }

