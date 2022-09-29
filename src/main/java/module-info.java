module com.example.menu_ejemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.menu_ejemplo to javafx.fxml;
    exports com.example.menu_ejemplo;
}