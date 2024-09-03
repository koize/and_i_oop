module com.example.oop_lab3_qn5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.oop_lab3_qn5 to javafx.fxml;
    exports com.example.oop_lab3_qn5;
}