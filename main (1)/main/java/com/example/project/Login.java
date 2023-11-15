package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Login {
    @FXML
    private Button loginbutton;
    @FXML
    private Label wronglogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;


    public void userLogin(ActionEvent event) throws IOException{
        HelloApplication h=new HelloApplication();
        if(username.getText().toString().equals("shady") && password.getText().toString().equals("123"))
        {
            wronglogin.setText("Success");
            h.changeScene("afterlogin.fxml");
        }
        else if(username.getText().isEmpty() && password.getText().isEmpty())
        {
            wronglogin.setText("Enter your data");
        }
        else
        {
            wronglogin.setText("Wrong username or password");
        }
    }
}

