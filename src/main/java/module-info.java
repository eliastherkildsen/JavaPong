module com.example.pong {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.pong to javafx.fxml;
    exports com.example.pong;
}