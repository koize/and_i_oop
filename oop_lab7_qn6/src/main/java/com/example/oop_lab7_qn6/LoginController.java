package com.example.oop_lab7_qn6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btn_login;

    @FXML
    private PasswordField text_field_password;

    @FXML
    private TextField text_field_username;

    @FXML
    void onLoginClick(ActionEvent event) {
        String username = text_field_username.getText();
        String password = text_field_password.getText();

        if (username.equals("Joe") && password.equals("1234")) {
            startSecondWindow();
        }
    }

    public void startSecondWindow() {
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/com/example/oop_lab7_qn6/home_page.fxml"));
            Scene scene2 = new Scene(root, 400, 400);
            //scene2.getStylesheets().add(getClass().getResource("/com/example/oop_lab7_qn6/application.css").toExternalForm());
            Stage Window2 = new Stage();
            Window2.initModality(Modality.APPLICATION_MODAL);
            Window2.setScene(scene2);
            Window2.show();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
