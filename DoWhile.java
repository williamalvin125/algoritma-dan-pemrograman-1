public class DoWhile {

    public static void main(String[] args) {
        
        int sum=1,i=1;
        do {
            sum = sum + i;
            System.out.println("SUM IS "+sum);
            i++;
        }
        while(i<10);
        System.out.println("Maka SUM ADALAH : "+sum);
    }
    
}
