public class Test {
    
    public static void main(String[] args) {

        int sum=0;
        int j=0;
        for (int i = 0; i < 10; i++){
        sum += i;

        if (i < j)
        System.out.println(i);
        else
        System.out.println(j);

        while (j < 10){
            j++;
        }
    }
        /* 
        do {
            j++;
        } while (j < 10);*/
    
    }
 }