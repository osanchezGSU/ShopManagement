module com.example.shopmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.shopmanagement to javafx.fxml;
    exports com.example.shopmanagement;

}