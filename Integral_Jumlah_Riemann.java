import java.util.Scanner;

public class Integral_Jumlahan_Riemann {

	public static double f(double x) {
		return (2*x*x*x)-(3*x)+1;
	}
	public static double ujung_kiri(double n, double a, double b) {
		double sum = 0, dx = (b-a)/n, x;
		for (int k = 0; k<n ; k++) { 
			x = a+(k*dx);
			sum += f(x)*dx;
		}
		return sum;
	}
	public static double ujung_kanan(double n, double a, double b) {
		double sum = 0, dx = (b-a)/n, x;
		for (double k=1 ; k<=n ; k++) {
			x = a+(k*dx);
			sum += f(x)*dx;
		}
		return sum;
	}
	public static double titik_tengah(double n, double a, double b) {
		double sum = 0, dx = (b-a)/n, x;
		for (double k=1 ; k<=n ; k++) {
			x = (2*a+dx*(2*k-1))/2.0;
			sum += f(x)*dx;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Jumlah pias = ");
		double n = input.nextDouble();
		System.out.print("Batas bawah a = ");
		double a = input.nextDouble();
		System.out.print("Batas atas b = ");
		double b = input.nextDouble();
		input.close();	 
		
		double kiri, kanan, tengah, hasil_eksak = 4;
		System.out.println("Hasil eksak integral dari 2x^3-3x+1 : "+ hasil_eksak);
		
		kiri = ujung_kiri(n,a,b);
		kanan = ujung_kanan(n,a,b);
		tengah = titik_tengah(n,a,b);
		
		System.out.println("\nHasil luas kiri  : "+kiri);
		System.out.println("Dengan error: "+Math.abs(hasil_eksak-kiri));
		System.out.println("\nHasil luas kanan : "+kanan);
		System.out.println("Dengan error: "+Math.abs(hasil_eksak-kanan));
		System.out.println("\nhasil luas tengah: "+tengah);
		System.out.println("Dengan error: "+Math.abs(hasil_eksak-tengah));
	}
}