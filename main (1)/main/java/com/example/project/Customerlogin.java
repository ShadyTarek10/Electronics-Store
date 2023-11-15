package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Customerlogin {

    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button BackButton;

    public void userLoginbutton(ActionEvent event) throws IOException{

        HelloApplication h=new HelloApplication();
        if(username.getText().toString().equals("shady") && password.getText().toString().equals("123") )
        {
            h.changeScene("userpage.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty())
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error Alert Dialog");
            a.setContentText("Please user your Username/ID and Password");
            a.showAndWait();
        }
        else
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error Alert Dialog");
            a.setContentText("Please enter your Username/ID and Password correctly");
            a.showAndWait();
        }
    }
    private  Stage stg;
    private Scene scene;
    private  Parent root;
    public void onBack(ActionEvent event) throws IOException{
      /* Parent root=FXMLLoader.load(getClass().getResource("adminorcustomer.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();*/
        HelloApplication h=new HelloApplication();
        h.changeScene("adminorcustomer.fxml");



    }


}
