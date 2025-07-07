module com.strings {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.strings to javafx.fxml;
    exports com.strings;
}
