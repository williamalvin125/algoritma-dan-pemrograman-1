public class ArrayGeser {
    public static void main(String[] args) {

        
        double [] myList = {7.0,5.0,4.0,10.0,11.0,12.0};
        double temp = myList[0];

        System.out.println("Geser kiri 7, 5, 4, 10, 11, 12 :");
        for (int i = 1; i<myList.length; i++){
            myList[i-1] = myList[i];
            System.out.print(myList[i] +" ");
        }
        myList[myList.length - 1] = temp;
        System.out.println(myList[myList.length - 1]);

    }
}