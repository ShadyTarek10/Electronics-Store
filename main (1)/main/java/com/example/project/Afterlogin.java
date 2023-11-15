package com.example.project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class Afterlogin {
    @FXML
    private Button logoutbutton;
    @FXML
    protected TableView<Product> tableView;
    @FXML
    protected Button ADD;
    @FXML
    TableColumn<Product,String> model;
    @FXML
    TableColumn<Product,String> price;
    @FXML
    TableColumn<Product,String> warranty;
    @FXML
    TableColumn<Product,String> brand;



    public void userlogout(ActionEvent event) throws IOException{
        HelloApplication m=new HelloApplication();
        m.changeScene("hello-view.fxml");
    }

    public void add(ActionEvent e) throws IOException{
        tableView.getItems().add(new laptop("10","10","a","b"));
    }
}
