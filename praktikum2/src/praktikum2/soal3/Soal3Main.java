package praktikum2.soal3;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
		//error karena kurang titik koma di akhir
		//p1.nama = "Roi"
		p1.nama = "Roi";
		p1.asal = "Kingdom of Orvel";
		p1.setJabatan("Assasin");
		//menambah inisialisasi umur karena sebelumnya tidak ada nilai default atau inisialisasi sehingga output umur menjadi 0
		p1.umur = 17;
		
		System.out.println("Nama: " + p1.getNama());
		System.out.println("Asal: " + p1.getAsal());
		System.out.println("Jabatan: " + p1.jabatan);
		//tidak ada error, tetapi ingin menambahkan kata 'Tahun' agar sesuai dengan output yang diminta
		//System.out.println("Umur: " + p1.umur);
		System.out.println("Umur: " + p1.umur + " Tahun");
	}

}
