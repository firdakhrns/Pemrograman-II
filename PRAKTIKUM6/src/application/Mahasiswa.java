package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Mahasiswa {
	private int id;
	private String nim;
	private String nama;
	
	public Mahasiswa(int id, String nama, String nim){
		this.id = id;
		this.nama = nama;
		this.nim = nim;
	}
	
	public int getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}
	
	public String getNim() {
		return nim;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}

    public static ObservableList<Mahasiswa> getMahasiswaList() {
        return FXCollections.observableArrayList(
            new Mahasiswa(1, "Karina", "230001"),
            new Mahasiswa(2, "Ning Ning", "230002"),
            new Mahasiswa(3, "Winter", "230003"),
            new Mahasiswa(4, "Giselle", "230004"),
            new Mahasiswa(5, "Mark", "230005"),
            new Mahasiswa(6, "Dekisugi", "230006"),
            new Mahasiswa(7, "Renjun", "230007"),
            new Mahasiswa(8, "Noah", "230008"),
            new Mahasiswa(9, "Sizuka", "230009"),
            new Mahasiswa(10, "Nobita", "230010")
        );
    }

}
