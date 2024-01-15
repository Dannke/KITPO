module com.example.kitpo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kitpo to javafx.fxml;
    exports com.example.kitpo;
}