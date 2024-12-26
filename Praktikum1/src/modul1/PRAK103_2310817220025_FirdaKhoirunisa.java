package modul1;
import java.util.Scanner;

public class PRAK103_2310817220025_FirdaKhoirunisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah Angka: ");
		int jumlah = input.nextInt();
		System.out.print("Angka Pertama: ");
		int angka = input.nextInt();
		
		int num = 0;
		do {
			if(angka % 2 != 0) {
				System.out.print(angka + " ");
				num++;
			}
			angka++;
		}while (num < jumlah);
	}
}