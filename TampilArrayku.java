public class TampilArrayku {

    public static void main(String[] args) {
        
        int [] arrayku = {1,23,17,4,5,100};

        System.out.println("Data ke-1 = " +arrayku[0]);
        System.out.println("Data ke-2 = " +arrayku[1]);
        System.out.println("Data ke-3 = " +arrayku[2]);
        System.out.println("Data ke-4 = " +arrayku[3]);
        System.out.println("Data ke-5 = " +arrayku[4]);
        System.out.println("Data ke-6 = " +arrayku[5]);

        System.out.println();

        int [] arrayKu = {-1,-23,-17,-4,-5,-100};
        for (int j=0; j<6;j++){
            System.out.println("Data ke-" +(j+1) +"= " +arrayKu[j]);
        }
        System.out.println();

        for (int j=5; j>=0;j--) {
            System.out.println("Data ke-" +(j+1) +"= " +arrayKu[j]);
        }
        System.out.println();

        double [] myList = new double[10];
        myList[0] = 5.6;
        myList[1] = 1.6;
        myList[2] = 2.6;
        myList[3] = 5.3;
        myList[4] = 5.1;
        myList[5] = 9.6;
        myList[6] = 8.8;
        myList[7] = 0.4;
        myList[8] = 5.2;
        myList[9] = 1.2;
        for (int k=0; k<10;k++){
            System.out.println("Data ke-" +(k+1) +"= " +myList[k]);
        }
        System.out.println();

        char[] huruf = {'I','N','D','O','N','E','S','I','A'};
        System.out.println(huruf);
        System.out.println("Huruf ke 2 INDONESIA : " +huruf[1]);

    }
}