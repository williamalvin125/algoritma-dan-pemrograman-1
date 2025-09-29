public class Challenge {

    public static void main(String[] args) {
        
        int x1=3, y1=5;
        int L = 30;
        int A = x1, B = -2*L, C = 2*L*y1;

        double D = Math.sqrt(B*B-(4*A*C));
        double akar = (-B + Math.sqrt(D)) /(2*A);
        
        double gradien = (-akar*akar)/(2*L);

        System.out.println("Maka a adalah " +gradien);
        System.out.println("Maka b adalah " +akar);
    }
    
}
