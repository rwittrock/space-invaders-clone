module com.example.spaceinvadersclone {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.spaceinvadersclone to javafx.fxml;
    exports com.example.spaceinvadersclone;
}