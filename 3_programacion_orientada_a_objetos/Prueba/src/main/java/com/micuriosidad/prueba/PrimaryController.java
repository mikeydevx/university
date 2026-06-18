package com.micuriosidad.prueba;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    public void mostrarHolaMundo(javafx.event.ActionEvent event) {
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Mensaje");
    alert.setHeaderText(null);
    alert.setContentText("¡Hola Mundo desde un botón arrastrado!");
    alert.showAndWait();
}

    
}
