public class ProgramHitungDigit {

    public static void main(String[] args) {

                    System.out.print("Jika, diketahui angka yaitu 1234, maka jumlah digitnya adalah ");
                    int angka = 1234;

                    int a = (angka/1000)%10;
                    int b = (angka/100)%10;
                    int c = (angka/10)%10;
                    int d = (angka/1)%10;
                    int e = a + b + c + d;

                    if (angka>=1 && angka<=9999) {
                    System.out.println(e);
                }

                else {
                    System.out.println("ERROR!");
                } 

    }
}