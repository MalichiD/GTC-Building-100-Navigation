module com.example.building100navigator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.building100navigator to javafx.fxml;
    exports com.example.building100navigator;
}