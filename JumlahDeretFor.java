public class JumlahDeretFor{

    public static void main(String[] args) {
        
        int i;
        for (i=0; i<10; i++) {
            System.out.println("Saya belajar Java.");
        }
        
        double jumlah = 0;
        int ii;
        for (ii=1; ii<26;) {
            jumlah = jumlah + (ii/((ii+1.0)*(ii+2.0)));
            System.out.println("Maka, "+jumlah);
            ii++;
        }
        
    }
    
}
