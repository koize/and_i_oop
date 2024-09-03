module com.example.oop_lab5_qn5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_lab5_qn5 to javafx.fxml;
    exports com.example.oop_lab5_qn5;
}