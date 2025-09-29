import java.net.Socket;
import java.util.Scanner;
public class ReservedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = input.nextLine();

        ing n = kata.length();
        char a;
        String s;
        for(int i=0; i<kata.length();i++){
            a = kata.charAt(i);
            s += a;
            System.out.println(s);
        }
    }
}