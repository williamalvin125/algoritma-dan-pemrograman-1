import java.util.Scanner;
public class RekursifFaktorial2 {
    
    static int Faktorial(int a) {
        if (a == 1 || a == 0)
        return 1;
        else
        return a * Faktorial(a - 1);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);//instance class Scanner
    System.out.print("Masukkan angka :");
    int angka = input.nextInt();//new variable to save number
    for(int i=1;i<=angka;i++){
        System.out.println(i+"! adalah "+Faktorial(i));//call angka as parameter
    }
}
}