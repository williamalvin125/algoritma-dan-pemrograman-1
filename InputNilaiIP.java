import java.util.Scanner;

public class InputNilaiIP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai dari 0-100 : ");
        System.out.print("Tugas = ");
        int tugas = input.nextInt();
        System.out.print("Quiz = ");
        int quiz = input.nextInt();
        System.out.print("ETS = ");
        int ets = input.nextInt();
        System.out.print("EAS = ");
        int eas = input.nextInt();

        double TUGAS = tugas * 0.1;
        double QUIZ = quiz * 0.2;
        double ETS = ets * 0.35;
        double EAS = eas * 0.35;

        double nilai = TUGAS+QUIZ+ETS+EAS;


        System.out.println("\n\n");
        if(nilai<=100 && nilai>=86) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = A");
            System.out.println("IP : 4.0");
        }

        else if(nilai>=76) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = AB");
            System.out.println("IP : 3.5");
        }

        else if(nilai>=66) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = B");
            System.out.println("IP : 3.0");
        }

        else if(nilai>=61) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = BC");
            System.out.println("IP : 2.5");
        }

        else if(nilai>=56) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = C");
            System.out.println("IP : 2.0");
        }

        else if(nilai>=41) {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = D");
            System.out.println("IP : 1.5");
        }

        else {
            System.out.println("Nilai kamu " +nilai);
            System.out.println("Bobot = E");
            System.out.println("IP : 1.0");
        }

        input.close();

    }

}