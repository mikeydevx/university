module com.micuriosidad.prueba {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.micuriosidad.prueba to javafx.fxml;
    exports com.micuriosidad.prueba;
}
