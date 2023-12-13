module com.example.taxigame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taxigame to javafx.fxml;
    exports com.example.taxigame;
}