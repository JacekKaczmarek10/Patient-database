package com.timbuchalka.todolist;

import com.sun.jdi.Value;
import com.timbuchalka.todolist.datamodel.TodoData;
import com.timbuchalka.todolist.datamodel.TodoItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.time.LocalDate;

/**
 * Created by timbuchalka on 8/05/2016.
 */
public class DialogController {
    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private ChoiceBox<String> choiceBox1;

    @FXML
    private TextField patientData;


    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;




    public TodoItem processResults() {
        String shortDescription = patientData.getText().trim();
        String model = choiceBox.getSelectionModel().getSelectedItem().toString();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();
        String hour = choiceBox1.getSelectionModel().getSelectedItem().toString();

        TodoItem newItem = new TodoItem(shortDescription, model,
                details, deadlineValue,hour);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
