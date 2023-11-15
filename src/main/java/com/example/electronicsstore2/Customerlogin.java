package com.example.electronicsstore2;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.io.IOException;
import java.util.ResourceBundle;

public class Customerlogin  {

    @FXML
    private Button login;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button BackButton;

    public void userLoginbutton(ActionEvent event) throws IOException, SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        Statement statement=connection.createStatement();
        String sql="SELECT * FROM customerinfo where CustomerID = '"+username.getText()+"'AND Password='" +password.getText()+"';";
        ResultSet resultSet=statement.executeQuery(sql);

        HelloApplication h=new HelloApplication();
        if(resultSet.next())
        //if(username.getText().toString().equals("shady") && password.getText().toString().equals("123") )
        {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("userpage.fxml"));
            Parent root = loader.load();
            Scene mainScene = new Scene(root);

            UserPage af = loader.getController();
            //h.changeScene("userpage.fxml");

            UserPage.s=username.getText();
            af.initData(username.getText());
            loader.setController(af) ;

            Stage primaryStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            primaryStage.setScene(mainScene);
            primaryStage.show();
        }
       /* else if(username.getText().isEmpty() && password.getText().isEmpty())
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error Alert Dialog");
            a.setContentText("Please user your Username/ID and Password");
            a.showAndWait();
        }*/
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
