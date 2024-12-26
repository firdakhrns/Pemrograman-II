package modul1;
import java.util.Scanner;

public class PRAK102_2310817220025_FirdaKhoirunisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Angka Awal: ");
		int angka = input.nextInt();
		
		int num = 0;
		while(num < 11) {
			int hasil = angka;
			if(angka % 5 == 0) {
				hasil = angka / 5 - 1;
			}
			System.out.print(hasil + ", ");
			angka++; 
			num++;
		}
	}
}