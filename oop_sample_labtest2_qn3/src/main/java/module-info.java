module com.example.oop_sample_labtest2_qn3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_sample_labtest2_qn3 to javafx.fxml;
    exports com.example.oop_sample_labtest2_qn3;
}