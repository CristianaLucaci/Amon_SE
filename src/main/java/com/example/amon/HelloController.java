package com.example.amon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button getHelp;

    @FXML
    public void handleGetHelpClick(ActionEvent event) throws IOException {

        Parent formParent = FXMLLoader.load(getClass().getResource("options.fxml"));
        Scene formScene = new Scene(formParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(formScene);
        window.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Loading user data..");
    }
}