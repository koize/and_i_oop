module com.example.oop_lab7_qn6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_lab7_qn6 to javafx.fxml;
    exports com.example.oop_lab7_qn6;
}