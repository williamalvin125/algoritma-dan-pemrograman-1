public class RekursifFaktorial {
    public static void main(String[] args) {
        System.out.println(faktorial(100));
    }

        public static int faktorial(int n) {
            if ((n==0) || (n==1)) return 1;
            else return n * (faktorial(n-1));
        }

}