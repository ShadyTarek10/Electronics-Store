module com.example.electronicsstore2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.electronicsstore2 to javafx.fxml;
    exports com.example.electronicsstore2;
}