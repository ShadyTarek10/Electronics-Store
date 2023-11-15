package com.example.electronicsstore2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminorCustomer {
    @FXML
    private Button adminbutton;
    @FXML
    private Button userbutton;

    public void onAdmin(ActionEvent event) throws IOException {
        HelloApplication h=new HelloApplication();
        h.changeScene("hello-view.fxml");
    }
    private Stage stg;
    private Scene scene;
    private Parent root;
    public void onUser(ActionEvent event) throws IOException{
       Parent root= FXMLLoader.load(getClass().getResource("customerlogin.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
}
