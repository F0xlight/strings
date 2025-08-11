module com.strings {
    requires javafx.controls;
    requires javafx.fxml;
    requires jave.core;
    requires java.desktop;

    opens com.strings to javafx.fxml;
    exports com.strings;
}
