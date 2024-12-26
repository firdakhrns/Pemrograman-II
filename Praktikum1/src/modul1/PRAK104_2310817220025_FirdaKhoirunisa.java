package modul1;
import java.util.Scanner;

public class PRAK104_2310817220025_FirdaKhoirunisa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("Tangan Abu: ");
        String[] pilihanAbu = input.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] pilihanBagas = input.nextLine().split(" ");
        
        int skorAbu = 0;
        int skorBagas = 0;
        
        for(int i = 0; i < 3; i++) {
            String abu = pilihanAbu[i].toUpperCase();
            String bagas = pilihanBagas[i].toUpperCase();
            
            if(abu.equals(bagas)) {
                continue;
            }
            
            switch(abu) {
                case "B":
                    if(bagas.equals("G")) {
                        skorAbu++;
                    } else if(bagas.equals("K")) {
                        skorBagas++;
                    }
                    break;
                case "G":
                    if(bagas.equals("K")) {
                        skorAbu++;
                    } else if(bagas.equals("B")) {
                        skorBagas++;
                    }
                    break;
                case "K":
                    if(bagas.equals("B")) {
                        skorAbu++;
                    } else if(bagas.equals("G")) {
                        skorBagas++;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
   
        if(skorAbu > skorBagas) {
            System.out.println("Abu");
        }
        else if(skorBagas > skorAbu) {
            System.out.println("Bagas");
        }
        else {
            System.out.println("Seri");
        }
	}
}