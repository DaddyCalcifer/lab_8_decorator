module com.example.lab_decorator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_decorator to javafx.fxml;
    exports com.example.lab_decorator;
}