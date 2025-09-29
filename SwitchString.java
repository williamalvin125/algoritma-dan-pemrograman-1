import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan karakter nama anda : ");
        String inisial = input.nextLine();
        switch (inisial) {
            case "a" : System.out.println("Nama anda pasti Angga");
            break;
            case "b" : System.out.println("Nama anda pasti Budi");
            break;
            default : System.out.println("Nama anda tidak terkenal");
            break;
        }
    }
}