package com.example.electronicsstore2;

import Connectivity.ConnectionClass;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

public class AdminData implements Initializable {
    @FXML
    private Label GetDataLabel;
    @FXML
     private Button back;



    Admin a = new Admin("  Shady ","  Male","  150 Years","  19100178","  123");
   /* @FXML
    protected void aa(ActionEvent event){
        GetDataLabel.setText(a.GetData());
    }*/


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        GetDataLabel.setText(a.GetData());
    }




    private Stage stg;
    private Scene scene;
    private Parent root;

    @FXML
    public void onBack(ActionEvent event) throws IOException {

         Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("afterlogin.fxml")));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();

    }
}
