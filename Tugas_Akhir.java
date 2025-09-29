import java.util.Scanner;

public class Tugas_Akhir {
	public static boolean savedUser(String[][] savedData, String kata) {
		for (int i=0;i<savedData.length;i++) {
			if (kata.equals(savedData[i][0]))
				return true;
		} return false;
	}
	public static boolean savedPass(String[][] savedData, String user, String pass) {
		int count = 0;
		for (int i=0;i<savedData.length;i++) {
			if (user.equals(savedData[i][0])) 
				count = i;
		}
		if (pass.equals(savedData[count][1])) return true;
		return false;
	}
	public static int[] Str2Code(String kata) {
		int array[] = new int[kata.length()];
		for (int i=0;i<kata.length();i++) {
			array[i] = kata.charAt(i);
		} return array;
	}
	
	public static boolean isLong(String pilihan, String kata) {
		switch(pilihan) {
		case "user": if (kata.length()>=6) return true;
		case "pass": if (kata.length()>=8) return true;
		default: return false;
		}
	}
	public static boolean hasNumOrChar(String pilihan, String kata) {
		int countUpper = 0, countLower = 0, countNum = 0;
		switch(pilihan) {
		case "user":
			for (int kode : Str2Code(kata)) {
				if (Character.isLowerCase(kode)) countLower++;
				if (countLower == kata.length()) return true;
			} break;
		case "pass":
			for (int kode : Str2Code(kata)) {
				if (Character.isUpperCase(kode)) countUpper++;
				else if (Character.isLowerCase(kode)) countLower++;
				else if (Character.isDigit(kode)) countNum++;
				int sum = countUpper+countLower+countNum;
				if (countUpper>0 && countLower>0 && countNum>=2 && 
					sum == kata.length()) return true;
			} break;
		} return false;
	}
	public static boolean isValid(String pilihan, String kata) {
		switch(pilihan) {
		case "user":
			if (isLong(pilihan,kata) & hasNumOrChar(pilihan,kata)) return true;
		case "pass":
			if (isLong(pilihan,kata) & hasNumOrChar(pilihan,kata)) return true;
		} return false;
	}
	
	public static void main(String[] args) {
		String Data[][] = {{"azakiyudin","PakeArray21"},
						   {"hilmirachman","ArraysCopy0f1"},
						   {"alproenam","HarusV4L1d"},{null,null}};

		Scanner input = new Scanner(System.in);
		System.out.print("===========SELAMAT DATANG============");
		System.out.print("\n1. Daftarkan akun baru"
					   + "\n2. Masuk dengan akun lama"
					   + "\nPilihan Anda = ");
		String user, pass, pilihan = input.nextLine();
		
		switch(pilihan) {
		case "1":
			while (true) {
				System.out.print("Masukkan username = ");
				user = input.nextLine();
				System.out.print("Masukkan password = ");
				pass = input.nextLine();
				
				if (isValid("user",user) == false) {
					System.out.println("Username tidak valid\n"
									 + "Silahkan daftar kembali dengan username yang valid");
					continue;	
				}
				else if (isValid("pass",pass) == false) {
					System.out.println("Password tidak valid\n"
							         + "Silahkan daftar kembali dengan password yang valid");
					continue;
				}
				else if (savedUser(Data,user)) {
					System.out.println("Username sudah ada\n"
									 + "Silahkan daftar kembali dengan username yang valid");
					continue;
				}
				else {
					System.out.println("===Selamat Anda Berhasil Mendaftar===\n"
									 + "=====================================");
					Data[3][0] = user; Data[3][1] = pass; 
					break;
				} 
			} 
			System.out.println("============Silakan Login============");
			while (true) {
				System.out.println("=====================================");
				System.out.print("Masukkan username = ");
				String newUser = input.nextLine();
				System.out.print("Masukkan password = ");
				String newPass = input.nextLine();
				
				if (!savedUser(Data,newUser)) {
					System.out.println("Username tidak ditemukan");
					continue;
				}
				else if (!savedPass(Data,newUser,newPass)) {
					System.out.println("Password salah");
					continue;
				}
				System.out.println("=====Selamat anda berhasil login=====\n"
						 		 + "=====================================");
				break;
			} break;
		case "2":
			while (true) {
				System.out.println("=====================================");
				System.out.print("Masukkan username = ");
				user = input.nextLine();
				System.out.print("Masukkan password = ");
				pass = input.nextLine();
				
				if (!savedUser(Data,user)) {
					System.out.println("Username tidak ditemukan"); 
					continue;
				}
				else if (!savedPass(Data,user,pass)) {
					System.out.println("Password salah");
					continue;
				}
				System.out.print("=====Selamat anda berhasil login=====\n"
							   + "=====================================");
				break;
			} break;
		default: System.out.println("Inputan salah"); break;
		} input.close();
	}
}