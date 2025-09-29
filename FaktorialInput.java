import java.util.Scanner;

public class FaktorialInput {

    public static void main(String[] args) {
    
    Scanner inputfaktorial = new Scanner(System.in);
    System.out.println("Nilai faktorial dari : ");
    int Faktorial = inputfaktorial.nextInt();

    //  {} digunakan untuk membuat fungsi suatu syntax
    if (Faktorial<0) //if untuk membuat permisalan
    {
        System.out.println("Tidak ada");
    }
    else //jika tidak terpenuhi if, maka terpenuhi else
    {
        int result=1; 
        for(int i=1; i<Faktorial+1; i++) //for untuk mengulang dengan syarat
        {
            result=result*i;
        }
        System.out.println("Hasilnya adalah "+result);
    }
        inputfaktorial.close();
    }
    
}
