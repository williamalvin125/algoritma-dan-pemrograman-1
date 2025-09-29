import java.util.Scanner;

public class FormatDemoScanner {
    public static void main(String[] args) {
// Display the header of the table
    System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

    Scanner input = new Scanner(System.in);
    int degrees = input.nextInt();
    double radians = Math.toRadians(degrees);
    System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

    input.close();
}
}