package praktikum2.soal1;

public class Buah {
	public String namaBuah;
	public double berat;
	public double harga;

    public double hargaAsli(double jumlahBeli) {
        return (jumlahBeli / berat) * harga;
    }

    public double hitungDiskon(double jumlahBeli) {
        int diskon = (int)(jumlahBeli / 4);
        return diskon * 0.02 * harga * 4;
    }

    public double hargaDiskon(double jumlahBeli) {
        return hargaAsli(jumlahBeli) - hitungDiskon(jumlahBeli);
    }
	
	public void info(double jumlahBeli) {
		System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Harga: Rp " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp %.2f\n", hargaAsli(jumlahBeli));
        System.out.printf("Total Diskon: Rp %.2f\n", hitungDiskon(jumlahBeli));
        System.out.printf("Harga Setelah Diskon: Rp %.2f\n", hargaDiskon(jumlahBeli));
        System.out.println(" ");
	}
}
