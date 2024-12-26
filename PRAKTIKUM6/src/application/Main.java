package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	 @Override
	    public void start(Stage primaryStage) {
	        TableView<Mahasiswa> tableView = new TableView<>();

	        TableColumn<Mahasiswa, String> nimColumn = new TableColumn<>("NIM");
	        nimColumn.setMinWidth(100);
	        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));

	        TableColumn<Mahasiswa, String> namaColumn = new TableColumn<>("Nama");
	        namaColumn.setMinWidth(100);
	        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

	        tableView.getColumns().addAll(nimColumn, namaColumn);

	        ObservableList<Mahasiswa> mahasiswaList = Mahasiswa.getMahasiswaList();
	        tableView.setItems(mahasiswaList);

	        VBox vbox = new VBox(tableView);

	        Scene scene = new Scene(vbox, 400, 300);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Daftar Mahasiswa");
	        primaryStage.show();
	    }

	
	public static void main(String[] args) {
		launch(args);
	}
}
