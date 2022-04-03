package com.example.amon;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("amon-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620, 350);
        stage.setTitle("Amon");
        stage.setScene(scene);
        stage.show();

        Controller controller = new Controller();

    }

    public static void main(String[] args) {
        launch();
    }
}