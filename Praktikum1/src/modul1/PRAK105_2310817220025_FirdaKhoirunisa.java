package modul1;
import java.util.Scanner;

public class PRAK105_2310817220025_FirdaKhoirunisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double phi = 3.14;
		
		System.out.print("Masukkan jari-jari: ");
		double r = input.nextDouble();
		System.out.print("Masukkan tinggi: ");
		double t = input.nextDouble();
		
		double v = phi * r * r * t;
		
		System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", r, t, v);

	}
}