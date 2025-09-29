public class ArrayDataTerbesar {
    
    public static void main(String[] args) {

        System.out.println("Tentukan nilai terbesar dari data 3,10,15,6,100,1,4,5!");
        int [] data = {3,10,15,6,100,1,4,5};
        int max = data[0];
        for (int i = 0; i<data.length;i++){
            if (data[i] > max ) {
                max = data[i];
            }
            else{}
        }
        System.out.println("Maka, nilai terbesar dari data adalah " +max);

    }
}