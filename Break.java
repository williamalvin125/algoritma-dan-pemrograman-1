public class Break {
    public static void main(String[] args) {
        
        for(int i = 0; i<5; i++){
            System.out.println("i = " +i);
            if(i==2){
                break;
            }
        }

        int x = 35;
        int y = 4;
        int dummy = y;
        mulai :
        while (true) {
            if (y>=x){
                System.out.println("Nilai kelipatan y yang mendekati x adalah " +y);
                break mulai;
            }
            y = y + dummy;
        }

        for (int a = 0; a<5; a++){
            for (int b = 0; b < 5; b++){
                System.out.println("["+a+","+b+"]");
                if (j==2){
                    break;
                }
            }
        }
    }
}