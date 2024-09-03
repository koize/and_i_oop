package com.example.oop_lab3_qn5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private Button btn;

    @FXML
    private TextArea txtOut;

    @FXML
    void onBtnClick(ActionEvent event) {
        txtOut.setText("morning steve");
    }

}
