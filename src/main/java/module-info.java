module com.example.javafx2024 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.javafx2024 to javafx.fxml;
    exports com.example.javafx2024;
}