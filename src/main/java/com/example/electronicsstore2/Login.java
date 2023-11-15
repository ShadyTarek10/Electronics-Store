package com.example.electronicsstore2;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Login {

    @FXML
    private Button loginbutton;
    @FXML
    private Label wronglogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button backbutton;


    public void onBack(ActionEvent event)throws IOException{
        HelloApplication m=new HelloApplication();
        m.changeScene("adminorcustomer.fxml");
    }


    



    private Stage stg;
    private Scene scene;
    private Parent root;
    public void userLogin(ActionEvent event) throws IOException, SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        Statement statement=connection.createStatement();
        HelloApplication h=new HelloApplication();
        String sql="SELECT * FROM AdminInfo where ID = '"+username.getText()+"'AND Password='" +password.getText()+"';";
        ResultSet resultSet=statement.executeQuery(sql);
        if(resultSet.next())
        //if(username.getText().toString().equals("shady") && password.getText().toString().equals("123"))
        {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("afterlogin.fxml"));
            Parent root = loader.load();
            Scene mainScene = new Scene(root);

            Afterlogin mainWindowController = loader.getController();

            mainWindowController.initData(username.getText());
            loader.setController(mainWindowController) ;

            Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            primaryStage.setScene(mainScene);
            primaryStage.show();
            
            wronglogin.setText("Success");
          /*  Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("afterlogin.fxml")));
            stg=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene= new Scene(root);
            stg.setScene(scene);
            stg.show();*/



           // h.changeScene("afterlogin.fxml");
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
