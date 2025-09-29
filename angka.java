public class angka {
    public static void main(String[] args) {
        cetakAngka(1);
    }

    static void cetakAngka(int angka){
        if(angka<=0)System.out.println("Salah input");
        else if (angka<=33){
            System.out.println(angka);
            cetakAngka(++angka+3);
        }
    }
}