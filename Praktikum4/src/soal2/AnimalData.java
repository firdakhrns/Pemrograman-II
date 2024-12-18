package soal2;
import java.util.Scanner;

public class AnimalData {
	Scanner input = new Scanner(System.in);
	
	public void pilihan() {
		System.out.println("Pilih jenis hewan yang ingin diinputkan:");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pil = input.nextInt();
		input.nextLine();
		
		if(pil == 1) {
			System.out.print("Nama Hewan Peliharaan: ");
			String nama = input.nextLine();
			System.out.print("Ras: ");
			String ras = input.nextLine();
			System.out.print("Warna Bulu: ");
			String warnaBulu = input.nextLine();
			
			Kucing k = new Kucing(nama, ras, warnaBulu);
			System.out.println("Detail Hewan Peliharaan:");
			k.displayDetailKucing();

		}else if(pil == 2) {
			System.out.print("Nama Hewan Peliharaan: ");
			String nama = input.nextLine();
			System.out.print("Ras: ");
			String ras = input.nextLine();
			System.out.print("Warna Bulu: ");
			String warnaBulu = input.nextLine();
			System.out.print("Kemampuan: ");
			String inputKemampuan = input.nextLine();
            String[] kemampuan = inputKemampuan.split(",");
            for (int i = 0; i < kemampuan.length; i++) {
                kemampuan[i] = kemampuan[i].trim();
            }
			
			Anjing a = new Anjing(nama, ras, warnaBulu, kemampuan);
			System.out.println("Detail Hewan Peliharaan:");
			a.displayDetailAnjing();
			
		}else {
			System.out.print("Pilihan tidak valid!");
		}
	}

}
