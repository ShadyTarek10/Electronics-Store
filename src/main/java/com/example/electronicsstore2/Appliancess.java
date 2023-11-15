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

public class Appliancess implements Initializable  {
    @FXML
    private Button back;
    @FXML
    private Label tv;
    @FXML
    private Label ref;
    @FXML
    private Label cm;
    @FXML
    private Label micro;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView selectedI;
    @FXML
    private Label selectedL;
    private Image img;
    @FXML
    private Button cart;
    Product [] app = {new Televisions("36","13000","4K UHD LED","Samsung","Smart TV","220W","150 x 70 x 25 cm","Black","65 inch","4k UHD","60 Hz","250 GB","21 Kg"),
                      new Appliances("12","6200","OK002","Arzum Okka","Coffee Machine","1000W","28 x 28 x 28 cm","Black","0.95 Liters"),
                      new Appliances("36","32000","GNE60500X","Beko","Refrigerator","1000W","195 x 60 x 55 cm","Silver","539 Liters"),
                      new Appliances("24","3500","R-75MT(S)","Sharp ","Microwave ","900W","30.5 X 51.3 X 42.5 cm","White","25 Liters")};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tv.setText(app[0].getData());
        cm.setText(app[1].getData());
        ref.setText(app[2].getData());
        micro.setText(app[3].getData());
    }
    public void handle1(MouseEvent e) {
        selectedL.setText(app[0].getData() + "\n" + app[0].specs());
        img = img1.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        tv.setVisible(false);
        img1.setVisible(false);
        cm.setVisible(false);
        img2.setVisible(false);
        ref.setVisible(false);
        img3.setVisible(false);
        micro.setVisible(false);
        img4.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle2(MouseEvent e) {
        selectedL.setText(app[1].getData() + "\n" + app[1].specs());
        img = img2.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        tv.setVisible(false);
        img1.setVisible(false);
        cm.setVisible(false);
        img2.setVisible(false);
        ref.setVisible(false);
        img3.setVisible(false);
        micro.setVisible(false);
        img4.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle3(MouseEvent t) {
        selectedL.setText(app[2].getData() + "\n" + app[2].specs());
        img = img3.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        tv.setVisible(false);
        img1.setVisible(false);
        cm.setVisible(false);
        img2.setVisible(false);
        ref.setVisible(false);
        img3.setVisible(false);
        micro.setVisible(false);
        img4.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle4(MouseEvent t) {
        selectedL.setText(app[3].getData() + "\n" + app[3].specs());
        img = img4.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        tv.setVisible(false);
        img1.setVisible(false);
        cm.setVisible(false);
        img2.setVisible(false);
        ref.setVisible(false);
        img3.setVisible(false);
        micro.setVisible(false);
        img4.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }


    public void bck(ActionEvent e) {
        selectedI.setVisible(false);
        selectedL.setVisible(false);
        tv.setVisible(true);
        img1.setVisible(true);
        cm.setVisible(true);
        img2.setVisible(true);
        ref.setVisible(true);
        img3.setVisible(true);
        micro.setVisible(true);
        img4.setVisible(true);
        back.setVisible(false);
        cart.setVisible(false);
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
    public void Acc(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Accessories.fxml"));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
    Scene s;
    Parent r;
    public void CA(ActionEvent event) throws IOException {
        r= FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Stage stage= new Stage();
        stage.setTitle("Cart");
        s= new Scene(r);
        stage.setScene(s);
        stage.show();
    }
}
