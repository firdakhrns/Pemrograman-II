package soal1;
import java.util.Random;

public class Dadu {
	private int nilai;
	
	public Dadu() {
		acakNilai();
	}
	
	public void acakNilai() {
		Random acak = new Random();
		this.nilai = acak.nextInt(6) + 1;
	}
	
	public int getNilai() {
		return nilai;
	}
}
