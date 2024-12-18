package soal2;
import java.util.Scanner;

public class HewanPeliharaan {
	Scanner input = new Scanner(System.in);
	private String nama;
	private String ras;
	
	public HewanPeliharaan(String nama, String ras) {
		this.nama = nama;
		this.ras = ras;
	}
	
	public void display() {
		System.out.println("Nama hewan peliharaanku adalah: " + nama);
		System.out.println("Dengan ras: " + ras);
	}
}