public class Loop {

    public static void main(String[] args) {
        
        for (int i = 0; i<5; i++) {
            System.out.println("Selamat datang for!");
        }

        int j = 0;
        while (j<5){
            System.out.println("Selamat datang while!");
            j++;
        }

        int k = 0;
        do{
            System.out.println("Selamat datang dowhile!");
            k++;
        } while (k<5);

        for(int l = 0; l<10; l=l+2){
            System.out.println(l);
        }

        for(int m = 0; m<5; m++){
            for(int n = 0; n<m; n++){
                System.out.print(n);
            }
            System.out.println();
        }

        boolean kondisi = true;
        int x =0;
        int y =0;
        while (kondisi){
            x++;
        }
        do {
            y++;
        } while (kondisi);
        System.out.println(x);
        System.out.println(y);
    }
}