package com.example.amon;

import com.example.amon.inference.Conclusion;
import com.example.amon.inference.ForwardChaining;
import com.example.amon.model.KnowledgeBase;
import com.example.amon.parser.Data;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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

        Data.getData();
        Conclusion.initialise();

        ForwardChaining.generateConclusion();
        System.out.println(ForwardChaining.getResult());
    }

    public static void main(String[] args) {

        launch();


    }
}