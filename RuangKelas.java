import java.util.Scanner;
public class RuangKelas {
    public static void main(String[] args) {
        
        String[][] meja = new String [2][3];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<2;i++){
            for(int j=0; j<3;j++){
                System.out.print("Meja (" +i +"," +j +") : ");
                meja[i][j] = scan.next();

                
            }
        }

        System.out.println("\n\n");

        for(int i=0; i<2;i++){
            for(int j=0; j<3;j++){
                System.out.println("Meja (" +i +"," +j +") : " +meja[i][j]);
            }
        }
    }
}