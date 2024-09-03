package com.example.oop_lab7_qn6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private Button btn_back;

    @FXML
    void onBackClick(ActionEvent event) {
        Stage window2 = (Stage)btn_back.getScene().getWindow();
        window2.close();
    }

}
