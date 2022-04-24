package ru.gb.messenger;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;

    @FXML
    private void sendButtonClick() {
        messageArea.appendText(messageField.getText() + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}