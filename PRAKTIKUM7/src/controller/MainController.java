package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class MainController {
	@FXML
    public void initialize() {
        // Inisialisasi GUI atau pengaturan tab, jika diperlukan
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
