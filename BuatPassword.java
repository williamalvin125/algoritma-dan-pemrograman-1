import java.util.Scanner;

public class BuatPassword {

    public static boolean passLength (String Pass) {
        for (int i=0; i<Pass.length(); i++){
            if(i>=7){
                return true;
            }      
        }
        return false;
    }

    public static boolean checkCaps (String Pass) {
        int code = 0;
        for (int i=0; i<Pass.length(); i++) {
            code = Pass.charAt(i);
            if (code>=65 && code<=90){
            return true;
            }
        }
        return false;
    }

    public static boolean checkLower (String Pass) {
        int code = 0;
        for (int i=0; i<Pass.length(); i++) {
            code = Pass.charAt(i);
            if (code>=97 && code<=122) {
                return true;
            }
        }
        return false;
    }

    public static boolean twoNumbers (String Pass) {
        int code = 0;
        int n = 0;
        for (int i=0; i<Pass.length(); i++){
            code = Pass.charAt(i);
            if(code>=48 && code<=57){
                n++;
            }
        }
        if (n>=2) {
            return true;
        }
        return false;
    }

    public static boolean noSymbol (String Pass) {
        int m = 0;
        int code = 0;
        for (int i=0; i<Pass.length(); i++) {
            code = Pass.charAt(i);
            if ((code>=65 && code<=90) || (code>=97 && code<=122) || (code>=48 && code<=57)){
            m++;
            }
        }
        if (m == Pass.length()) {
            return true;
        }
        return false;
    }

    public static boolean checkvalid (String Pass) {
        if ((passLength(Pass)) && (checkCaps(Pass)) && (checkLower(Pass)) && (twoNumbers(Pass)) && (noSymbol(Pass))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        while(true){
        System.out.print("Masukkan password : ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(checkvalid(password));
        
            if (checkvalid(password) == true){
                System.out.println("Password anda valid!");
                break;
            }
            else{
                System.out.println("Password anda tidak valid! Coba lagi.");
            }
        }
    }
}