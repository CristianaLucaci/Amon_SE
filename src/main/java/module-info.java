module com.example.amon {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires com.google.gson;


    opens com.example.amon to javafx.fxml;
    exports com.example.amon;
}