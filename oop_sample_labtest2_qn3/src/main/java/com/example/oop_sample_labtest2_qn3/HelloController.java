package com.example.oop_sample_labtest2_qn3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Stack;

public class HelloController {

    @FXML
    private Button btn_dist;

    @FXML
    private Button btn_load;

    @FXML
    private TextArea text_area_1;

    @FXML
    private TextArea text_area_2;

    @FXML
    private TextArea text_area_master;

    @FXML
    private TextField text_field_category;

    private String category;

    Stack<Object> masterStack = new Stack<>();


    @FXML
    void onClick(ActionEvent event) {
        if (event.getSource() == btn_load) {
            masterStack.clear();
            masterStack.push(new Book("Java 1", "OOP"));
            masterStack.push(new Book("C++", "Basics"));
            masterStack.push(new Book("Java 2", "OOP"));
            masterStack.push(new Book("HTML", "Web"));
            masterStack.push(new Book("PHP 1", "Web"));
            masterStack.push(new Book("Python", "Basics"));
            for (int i = 0; i < masterStack.size(); i++) {
                text_area_master.appendText(masterStack.get(i).toString() + "\n");
            }
            text_area_1.clear();
            text_area_2.clear();
            text_field_category.clear();
        } else if (event.getSource() == btn_dist) {
            category = text_field_category.getText();
            for (int i = 0; i < masterStack.size(); i++){
                if (masterStack.get(i).toString().contains(category)) {
                    text_area_1.appendText(masterStack.get(i).toString() + "\n");
                } else {
                    text_area_2.appendText(masterStack.get(i).toString() + "\n");
                }
            }
            masterStack.clear();


        }

    }

}

class Book {
    public String title;
    public String category;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String toString() {
        return title + "-" + category;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }
}
