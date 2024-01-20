module com.example.projektjavagui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens Controllers to javafx.fxml;
    exports Controllers;
    opens Client to javafx.fxml;
    exports Client;
    opens ServerConnection to javafx.base;
    exports ServerConnection;
    opens ObjectClasses to javafx.base;
    exports ObjectClasses;

}