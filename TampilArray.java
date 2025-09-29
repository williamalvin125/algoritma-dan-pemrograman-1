public class TampilArray {

    public static void main(String[] args) {

        int [] mylist = {10,3,2,6,7,4};
        int total = 0;
        for(int A=0; A<mylist.length; A++){
        total = total+mylist[A];
        System.out.println(total);
        }
    }
}