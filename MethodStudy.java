public class MethodStudy {

    public static int hitung (int input){
        int hasil = (input + 2)*input;
        return hasil;
    }
    public static void main(String[] args) {
        int x = 5;
        int y = hitung(x);
        System.out.println(y);
    }
}