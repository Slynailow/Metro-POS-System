module metro {
    requires javafx.controls;
    requires javafx.fxml;

    opens metro to javafx.fxml;
    exports metro;
}
