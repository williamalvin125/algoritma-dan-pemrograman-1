public class OperasiHitung {

    public static void main(String[] args) {
        int a = 100, b = 10;
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        
        int tambah = a + b;
        System.out.println("a+b : " +tambah);
        
        int kurang = a - b;
        System.out.println("a-b : " +kurang);
        
        int kali = a * b;
        System.out.println("a*b : " +kali);
        
        int bagi = a / b;
        System.out.println("a/b : " +bagi);
        
        int modulus = a % b;
        System.out.println("a%b dimana sisa hasil bagi : " +modulus);
        
        boolean c = true;
        boolean d = false;
        
        System.out.println("C and D : " + (c&d));
        System.out.println("C or D : " + (c|d));
        System.out.println("C xor D : " + (c^d));
        System.out.println("C and D (short circuit) : " + (c&&d));
        System.out.println("C or D (short circuit) : " + (c||d));
        
        boolean e = !c;
        System.out.println("Negasi C : " +e);
    }
    
}
