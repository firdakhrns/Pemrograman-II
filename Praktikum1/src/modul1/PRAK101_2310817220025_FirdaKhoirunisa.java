package modul1;
import java.util.Scanner;

public class PRAK101_2310817220025_FirdaKhoirunisa {
	public static String getMonth(int bulan) {
		String[] Month = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
		return Month[bulan - 1];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int TglLahir, bulan, tahun, TBadan;
		double BBadan;
		String nama, TmptLahir;
		
		System.out.print("Masukkan Nama Lengkap: ");
		nama = input.nextLine();
		System.out.print("Masukkan Tempat Lahir: ");
		TmptLahir = input.nextLine();
		System.out.print("Masukkan Tanggal Lahir: ");
		TglLahir = input.nextInt();
		System.out.print("Masukkan Bulan Lahir: ");
		bulan = input.nextInt();
		System.out.print("Masukkan Tahun Lahir: ");
		tahun = input.nextInt();
		System.out.print("Masukkan Tinggi Badan: ");
		TBadan = input.nextInt();
		System.out.print("Masukkan Berat Badan: ");
		BBadan = input.nextDouble();
		
		System.out.println("Nama Lengkap " + nama + ", lahir di " + TmptLahir + " pada Tanggal " + TglLahir + " " + getMonth(bulan) + " " + tahun);
		System.out.println("Tinggi Badan " + TBadan + " cm dan Berat Badan " + BBadan + " Kilogram");
	}
}