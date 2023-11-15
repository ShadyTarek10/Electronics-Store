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

public class MobileControl implements Initializable {
    Product[] products = { new Mobile("A32", "4700", "Samsung","12","5 inch", "6 Gb","128Gb", "12 MP", "Black", "5000 mA")
            ,new Mobile("A52S", "7000", "Samsung","12","6.5 inch", "8 Gb","256Gb", "64 MP", "Awesome Mint", "4500 mA"),
            new Mobile("Iphone13", "18000", "Apple","12","6.1 inch", "8 Gb","256Gb", "12 MP4k", "White", "3240 mA"),
            new Mobile("Redmi Note 10 Pro", "6444", "Xiaomi","12","6.67 inch", "8 Gb","128Gb", "64 MP", "Gray", "4000 mA")};
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
    protected Label selectedlabel;
    @FXML
    protected ImageView selectedimg;
    @FXML
    protected Button Backbt;
    @FXML
    protected Button Logout;
    @FXML
    protected Button cart;
    protected Image img;

    public void l1(MouseEvent e){
        selectedlabel.setText(products[0].getData()+"\n"+products[0].specs());
        img=img1.getImage();
        selectedimg.setImage(img);
        selectedimg.setVisible(true);
        selectedlabel.setVisible(true);
        label1.setVisible(false);
        img1.setVisible(false);
        label2.setVisible(false);
        img2.setVisible(false);
        label3.setVisible(false);
        img3.setVisible(false);
        label4.setVisible(false);
        img4.setVisible(false);
        Backbt.setVisible(true);
        cart.setVisible(true);
    }
    public void l2(MouseEvent e){
        selectedlabel.setText(products[3].getData()+"\n"+products[3].specs());
        img = img2.getImage();
        selectedimg.setImage(img);
        selectedimg.setVisible(true);
        selectedlabel.setVisible(true);
        label1.setVisible(false);
        img1.setVisible(false);
        label2.setVisible(false);
        img2.setVisible(false);
        label3.setVisible(false);
        img3.setVisible(false);
        label4.setVisible(false);
        img4.setVisible(false);
        Backbt.setVisible(true);
        cart.setVisible(true);
    }
    public void l3(MouseEvent e){
        selectedlabel.setText(products[1].getData()+"\n"+products[1].specs());
        img=img3.getImage();
        selectedimg.setImage(img);
        selectedimg.setVisible(true);
        selectedlabel.setVisible(true);
        label1.setVisible(false);
        img1.setVisible(false);
        label2.setVisible(false);
        img2.setVisible(false);
        label3.setVisible(false);
        img3.setVisible(false);
        label4.setVisible(false);
        img4.setVisible(false);
        Backbt.setVisible(true);
        cart.setVisible(true);
    }
    public void l4(MouseEvent e){
        selectedlabel.setText(products[2].getData()+"\n"+products[2].specs());
        img=img4.getImage();
        selectedimg.setImage(img);
        selectedimg.setVisible(true);
        selectedlabel.setVisible(true);
        label1.setVisible(false);
        img1.setVisible(false);
        label2.setVisible(false);
        img2.setVisible(false);
        label3.setVisible(false);
        img3.setVisible(false);
        label4.setVisible(false);
        img4.setVisible(false);
        Backbt.setVisible(true);
        cart.setVisible(true);
    }
    public void bck(ActionEvent e){
        selectedimg.setVisible(false);
        selectedlabel.setVisible(false);
        label1.setVisible(true);
        img1.setVisible(true);
        label2.setVisible(true);
        img2.setVisible(true);
        label3.setVisible(true);
        img3.setVisible(true);
        label4.setVisible(true);
        img4.setVisible(true);
        Backbt.setVisible(false);
        cart.setVisible(false);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        label1.setText(products[0].getData());
        label2.setText(products[3].getData());
        label3.setText(products[1].getData());
        label4.setText(products[2].getData());
        selectedimg.setVisible(false);
        selectedlabel.setVisible(false);
        Backbt.setVisible(false);
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
    public void Acc(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Accessories.fxml"));
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
    public void CA(ActionEvent event) throws IOException {
        r= FXMLLoader.load(getClass().getResource("Cart.fxml"));
        Stage stage= new Stage();
        stage.setTitle("Cart");
        s= new Scene(r);
        stage.setScene(s);
        stage.show();
    }
}
