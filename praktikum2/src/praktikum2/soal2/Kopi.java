package praktikum2.soal2;

public class Kopi {
	public String namaKopi;
	public String ukuran;
	public double harga;
	private String nama;
	
	public void info() {
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga: Rp. " + harga);
	}
	
	public void setPembeli(String nama) {
		this.nama = nama;
	}
	
	public String getPembeli() {
		return this.nama;
	}
	
	public double getPajak() {
		return this.harga * 0.11;
	}
}