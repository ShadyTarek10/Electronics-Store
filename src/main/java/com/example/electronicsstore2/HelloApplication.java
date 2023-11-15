package com.example.electronicsstore2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg=stage;
        stg.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("adminorcustomer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Mazarita Electronics");
        stage.setScene(scene);
        stage.show();
    }
    public void changeScene(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stg.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}