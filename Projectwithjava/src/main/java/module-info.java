module com.example.projectwithjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projectwithjava to javafx.fxml;
    exports com.example.projectwithjava;
}