package soal1;

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
		System.out.print("Nama Hewan Peliharaan: ");
		nama = input.nextLine();
		System.out.print("Ras: ");
		ras = input.nextLine();
		
		System.out.println("Detail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah: " + nama);
		System.out.println("Dengan ras: " + ras);
	}
}