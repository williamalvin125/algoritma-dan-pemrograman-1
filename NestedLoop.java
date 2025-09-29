public class NestedLoop {

    public static void main(String[] args) {
    
// nestedloop    
    int i = 0, sum = 0;
    while (i < 5) {
    for (int j = 1 ;j < 6;j++) {
        sum = sum + i + j;
    System.out.println("Nilai i " +i +" Nilai j " +j +" Nilai sum " +sum);
    }
    i++;
}
    System.out.println("Total: " +sum);
    }
}
