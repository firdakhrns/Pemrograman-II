package praktikum2.soal1;

public class Soal1Main {

	public static void main(String[] args) {
		Buah apel = new Buah();
		Buah mangga = new Buah();
		Buah alpukat = new Buah();
		
		apel.namaBuah = "Apel";
		apel.berat = 0.4;
		apel.harga = 7000;
		
		mangga.namaBuah = "Mangga";
		mangga.berat = 0.2;
		mangga.harga = 3500;
		
		alpukat.namaBuah = "Alpukat";
		alpukat.berat = 0.25;
		alpukat.harga = 10000;
		
		apel.info(40.0);
		mangga.info(15.0);
		alpukat.info(12.0);
	}
}