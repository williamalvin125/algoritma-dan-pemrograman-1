public class JumlahDeretWhile {

    public static void main(String[] args) {
        
        double jumlah=0;
        int i=1;
        
        while (i<21){
        jumlah = jumlah + (i/((i+1.0)*(i+2.0)));
        System.out.println("Maka, "+jumlah);
        i++;
        }
        
        double a=0;
        int suku=2;
        while(suku<20) {
            a = a + (1.0/suku);
            System.out.println("Maka (2), "+a);
            suku++;
        }

    }
    
}
