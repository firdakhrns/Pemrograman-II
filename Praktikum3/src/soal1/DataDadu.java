package soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class DataDadu {
	private LinkedList<Dadu> daduList;
    private int total;
	
	public DataDadu() {
		daduList = new LinkedList<>();
		total = 0;
	}
	
	public void shake() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = input.nextInt();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            total += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan: " + total);
	}    
}