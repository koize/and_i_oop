package com.example.oop_lab5_qn5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloController {
    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_import;

    @FXML
    private Label welcomeText;

    @FXML
    private ListView<String> listView;


    @FXML
    void onClearClick(ActionEvent event) {
        listView.getItems().clear();
    }

    @FXML
    void onImportClick(ActionEvent event) {
        String s = "a.txt";

        try {
            readTextFile(s);
            final ObservableList<String> listItems = FXCollections.observableArrayList();
            File myFile = new File(s);
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String a = sc.nextLine();
                listItems.add(a);
            }
            listView.setItems(listItems);

        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }


    }

    public static void readTextFile (String a) throws FileNotFoundException {
        String s;
        File myFile = new File(a);
        Scanner sc = new Scanner(myFile);
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            System.out.println(s);
        }


    }

}
