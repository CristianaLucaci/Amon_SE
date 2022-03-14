module com.example.amon {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.amon to javafx.fxml;
    exports com.example.amon;
}