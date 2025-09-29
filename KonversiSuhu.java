import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi Suhu ke : \n1. Celcius \n2. Reamur \n3. Fahrenheit \n4. Kelvin");
        int suhu = input.nextInt();

        if (suhu==1) {
            System.out.print("Masukkan nilai Celcius : ");
            int celcius = input.nextInt();
            System.out.println("Ubah Celcius menjadi : \n1. Reamur \n2. Fahrenheit \n3. Kelvin");
            int c = input.nextInt();
        if (c==1){
                double reamurc = (4.0/5.0)*celcius;
                System.out.println("Maka, " +celcius +"°C menjadi " +reamurc +"°R");
            }
            else if(c==2)
            {
                double fahrenheitc = (9.0/5.0*celcius)+32;
                System.out.println("Maka, " +celcius +"°C menjadi " +fahrenheitc +"°F");
            }
            else if(c==3)
            {
                double kelvinc = celcius + 273;
                System.out.println("Maka, " +celcius +"°C menjadi " +kelvinc +"K");
            }
        }
        
        else if (suhu==2) {
            System.out.print("Masukkan nilai Reamur : ");
            int reamur = input.nextInt();
            System.out.println("Ubah Reamur menjadi : \n1. Celcius \n2. Fahrenheit \n3. Kelvin");
            int r = input.nextInt();
        if (r==1){
                double celciusr = 5.0/4.0*reamur;
                System.out.println("Maka, " +reamur +"°R menjadi " +celciusr +"°C");
            }
            else if(r==2)
            {
                double fahrenheitr = (9.0/4.0*reamur)+32;
                System.out.println("Maka, " +reamur +"°R menjadi " +fahrenheitr +"°F");
            }
            else if(r==3)
            {
                double kelvinr = (5.0/4.0*reamur)+273;
                System.out.println("Maka, " +reamur +"°R menjadi " +kelvinr +"K");
            }
        }

        else if (suhu==3) {
            System.out.print("Masukkan nilai Fahrenheit :");
            int fahrenheit = input.nextInt();
            System.out.println("Ubah Fahrenheit menjadi : \n1. Celcius \n2. Reamur \n3. Kelvin");
            int f = input.nextInt();
        if (f==1){
                double celciusf = 5.0/9.0*(fahrenheit-32);
                System.out.println("Maka, " +fahrenheit +"°F menjadi " +celciusf +"°C");
            }
            else if(f==2)
            {
                double reamurf = 4.0/9.0*(fahrenheit-32);
                System.out.println("Maka, " +fahrenheit +"°F menjadi " +reamurf +"°R");
            }
            else if(f==3)
            {
                double kelvinf = (5.0/9.0*(fahrenheit-32))+273;
                System.out.println("Maka, " +fahrenheit +"°F menjadi " +kelvinf +"K");
            }
        }

        else {
            System.out.print("Masukkan nilai Kelvin : ");
            int kelvin = input.nextInt();
            System.out.println("Ubah Kelvin menjadi : \n1. Celcius \n2. Reamur \n3. Fahrenheit");
            int k = input.nextInt();
        if (k==1){
                double celciusk = kelvin-273;
                System.out.println("Maka, " +kelvin +"K menjadi " +celciusk +"°C");
            }
            else if(k==2)
            {
                double reamurk = 4.0/5.0*(kelvin-273);
                System.out.println("Maka, " +kelvin +"K menjadi " +reamurk +"°R");
            }
            else if(k==3)
            {
                double fahrenheitk = (9.0/5.0*(kelvin-273))+32;
                System.out.println("Maka, " +kelvin +"K menjadi " +fahrenheitk +"°R");
            }
        }

            input.close();
    }
}