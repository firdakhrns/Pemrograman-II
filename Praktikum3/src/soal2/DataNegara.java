package soal2;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class DataNegara {
	private LinkedList<Negara> negaraList;
    private HashMap<Integer, String> bulanMap;

	public DataNegara() {
		negaraList = new LinkedList<>();
        bulanMap = new HashMap<>();
        namaBulan();
	}
	
	private void namaBulan() {
        String[] month = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        for (int i = 0; i < month.length; i++) {
            bulanMap.put(i + 1, month[i]);
        }
    }

    public void info() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Masukkan nama negara: ");
            String nama = input.nextLine();
            System.out.print("Masukkan jenis kepemimpinan: ");
            String jenisKepemimpinan = input.nextLine();
            System.out.print("Masukkan nama pemimpin: ");
            String namaPemimpin = input.nextLine();

            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                System.out.print("Masukkan tanggal kemerdekaan: ");
                tanggal = input.nextInt();
                System.out.print("Masukkan bulan kemerdekaan: ");
                bulan = input.nextInt();
                System.out.print("Masukkan tahun kemerdekaan: ");
                tahun = input.nextInt();
                input.nextLine(); 
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun);
            negaraList.add(negara);
        }

        tampilkanDetail();
        input.close();
    }

    private void tampilkanDetail() {
        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " + 
                               (negara.getJenisKepemimpinan().equalsIgnoreCase("monarki") ? "Raja" : "Presiden") +
                               " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + 
                                   negara.getTanggalKemerdekaan() + " " + 
                                   bulanMap.get(negara.getBulanKemerdekaan()) + " " + 
                                   negara.getTahunKemerdekaan());
            }
            System.out.println();
        }
    }
}