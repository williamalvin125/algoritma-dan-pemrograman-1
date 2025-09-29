public class ArraySearch {
    public static void main(String[] args) {
        
        boolean ketemu = false;
        System.out.println("Apakah ada 3 diantara 5, 8, 1, 2, 13, 7, 9, 10, 11, 6?");
        int [] arr = {5, 8, 1, 2, 13, 7, 9, 10, 11, 6};
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 3){
                ketemu = true;
            }
        }
        System.out.println(ketemu);
    }
}