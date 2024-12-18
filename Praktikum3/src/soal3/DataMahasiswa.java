package soal3;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
	private ArrayList<Mahasiswa> mahasiswaList;
    private Scanner input;
    
    public DataMahasiswa() {
    	mahasiswaList = new ArrayList<>();
    	input = new Scanner(System.in);
    }

    private void Menu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Pilihan: ");
    }

    private void tambahMhs() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = input.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        mahasiswaList.add(mahasiswa);
        System.out.println("Mahasiswa " + nama + " ditambahkan.\n");
    }

    private void hapusMhs() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = input.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < mahasiswaList.size(); i++) {
            if (mahasiswaList.get(i).getNim().equals(nim)) {
                mahasiswaList.remove(i);
                System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.\n");
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.\n");
        }
    }

    private void cariMhs() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
        String nim = input.nextLine();

        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.getNim().equals(nim)) {
                System.out.println("Mahasiswa ditemukan:");
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("NIM: " + mahasiswa.getNim() + "\n");
                return;
            }
        }

        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.\n");
    }

    private void daftarMhs() {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong.\n");
            return;
        }

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
        }
        System.out.println();
    }
    
    public void Program() {
        int pilihan;
        
        do {
            Menu();
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahMhs();
                    break;
                case 2:
                    hapusMhs();
                    break;
                case 3:
                    cariMhs();
                    break;
                case 4:
                    daftarMhs();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (pilihan != 0);
    }
}