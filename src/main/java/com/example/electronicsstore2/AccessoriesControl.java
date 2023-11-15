package com.example.electronicsstore2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AccessoriesControl implements Initializable {
    Accessories[] Acc = { new Accessories("100", "Blue", "Samsung A32"),new Accessories("75", "Red & Black","Samsung A52"),
            new Accessories("200", "White", "IphonecCharger"), new Accessories("300", "Black", "Fast charging Type C"),
            new Accessories("75", "Black", "Samsung A32"),new Accessories("75", "Red", "Samsung A52S"),
            new Accessories("2000", "Phantom violet", "Galaxy buds"),new Accessories("3500", "White", "AirPods Pro")
    };
    @FXML
    protected Label label1;
    @FXML
    protected ImageView img1;
    @FXML
    protected Label label2;
    @FXML
    protected ImageView img2;
    @FXML
    protected Label label3;
    @FXML
    protected ImageView img3;
    @FXML
    protected Label label4;
    @FXML
    protected ImageView img4;
    @FXML
    protected Label label5;
    @FXML
    protected ImageView img5;
    @FXML
    protected Label label6;
    @FXML
    protected ImageView img6;
    @FXML
    protected Label label7;
    @FXML
    protected ImageView img7;
    @FXML
    protected Label label8;
    @FXML
    protected ImageView img8;
    @FXML
    protected Label selectedlabel;
    @FXML
    protected ImageView selectedimg;
    @FXML
    protected Button Logout;
    protected Image img;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        label1.setText(Acc[2].getData());
        label2.setText(Acc[1].getData());
        label3.setText(Acc[3].getData());
        label4.setText(Acc[0].getData());
        label5.setText(Acc[7].getData());
        label6.setText(Acc[5].getData());
        label7.setText(Acc[4].getData());
        label8.setText(Acc[6].getData());
        selectedimg.setVisible(false);
        selectedlabel.setVisible(false);
    }
    private Stage stg;
    private Scene scene;
    private Parent root;
    public void logout(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("AdminorCustomer.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    public void m(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("mobile.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    public void Ge(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Gears.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    public void la(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Laptops.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    public void app(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("appliances.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    Scene s;
    Parent r;
    public void CA(MouseEvent event) throws IOException {
        r= FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Stage stage= new Stage();
        stage.setTitle("Cart");
        s= new Scene(r);
        stage.setScene(s);
        stage.show();
    }
}
