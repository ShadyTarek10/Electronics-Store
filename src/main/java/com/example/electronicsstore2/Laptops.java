package com.example.electronicsstore2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Laptops implements Initializable {
    @FXML
    private Button logout;
    @FXML
    private Button back;
    @FXML
    private Label laptop1;
    @FXML
    private Label laptop2;
    @FXML
    private Label laptop3;
    @FXML
    private Label laptop4;
    @FXML
    private Label laptop5;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView selectedI;
    @FXML
    private Label selectedL;
    @FXML
    private Button mobile;
    @FXML
    private Button cart;
    private Image img;

    Product[] laptops =
            {       new laptop("36 months", "35000", "Triton 500", "Acer", "15.6 inch", "300 Hz", "16 GB", "512GB SSD", "RTX 2070 Super", "Intel core I7 10th gen", "Black"),
                    new laptop("12 months", "58000", "Alienware R5", "Dell", "15.6 inch", "300 Hz", "32 GB", "512GB SSD", "NVidia 1070 OC", "Intel core i7 8th gen", "Black"),
                    new laptop("24 months", "30000", "Legion 7", "Lenovo", "15.6 inch", "144 Hz", "16 GB", "1TB SSD", "RTX 3070", "Ryzen7", "Black"),
                    new laptop("36 months", "27000", "Omen 17", "HP", "17.3 inch", "144 Hz", "16 GB", "512GB SSD", "RTX 3060", "Intel core I7", "Black"),
                    new laptop("36 months", "26000", "MacBook Pro", "Apple", "13 inch", "120 Hz", "8 GB", "256GB", "8 core GPU", "Apple m1 chip", "White")};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        laptop1.setText(laptops[0].getData());
        laptop2.setText(laptops[1].getData());
        laptop3.setText(laptops[2].getData());
        laptop4.setText(laptops[3].getData());
        laptop5.setText(laptops[4].getData());

    }

    public void handle1(MouseEvent e) {
        selectedL.setText(laptops[0].getData() + "\n" + laptops[0].specs());
        img = img1.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        laptop1.setVisible(false);
        img1.setVisible(false);
        laptop2.setVisible(false);
        img2.setVisible(false);
        laptop3.setVisible(false);
        img3.setVisible(false);
        laptop4.setVisible(false);
        img4.setVisible(false);
        laptop5.setVisible(false);
        img5.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle2(MouseEvent e) {
        selectedL.setText(laptops[1].getData() + "\n" + laptops[1].specs());
        img = img2.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        laptop1.setVisible(false);
        img1.setVisible(false);
        laptop2.setVisible(false);
        img2.setVisible(false);
        laptop3.setVisible(false);
        img3.setVisible(false);
        laptop4.setVisible(false);
        img4.setVisible(false);
        laptop5.setVisible(false);
        img5.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle3(MouseEvent t) {
        selectedL.setText(laptops[2].getData() + "\n" + laptops[2].specs());
        img = img3.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        laptop1.setVisible(false);
        img1.setVisible(false);
        laptop2.setVisible(false);
        img2.setVisible(false);
        laptop3.setVisible(false);
        img3.setVisible(false);
        laptop4.setVisible(false);
        img4.setVisible(false);
        laptop5.setVisible(false);
        img5.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle4(MouseEvent t) {
        selectedL.setText(laptops[3].getData() + "\n" + laptops[3].specs());
        img = img4.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        laptop1.setVisible(false);
        img1.setVisible(false);
        laptop2.setVisible(false);
        img2.setVisible(false);
        laptop3.setVisible(false);
        img3.setVisible(false);
        laptop4.setVisible(false);
        img4.setVisible(false);
        laptop5.setVisible(false);
        img5.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void handle5(MouseEvent t) {
        selectedL.setText(laptops[4].getData() + "\n" + laptops[4].specs());
        img = img5.getImage();
        selectedI.setImage(img);
        selectedI.setVisible(true);
        selectedL.setVisible(true);
        laptop1.setVisible(false);
        img1.setVisible(false);
        laptop2.setVisible(false);
        img2.setVisible(false);
        laptop3.setVisible(false);
        img3.setVisible(false);
        laptop4.setVisible(false);
        img4.setVisible(false);
        laptop5.setVisible(false);
        img5.setVisible(false);
        back.setVisible(true);
        cart.setVisible(true);
    }

    public void bck(ActionEvent e) {
        selectedI.setVisible(false);
        selectedL.setVisible(false);
        laptop1.setVisible(true);
        img1.setVisible(true);
        laptop2.setVisible(true);
        img2.setVisible(true);
        laptop3.setVisible(true);
        img3.setVisible(true);
        laptop4.setVisible(true);
        img4.setVisible(true);
        laptop5.setVisible(true);
        img5.setVisible(true);
        back.setVisible(false);
        cart.setVisible(false);
    }

    private Stage stg;
    private Scene scene;
    private Parent root;

    public void mob(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mobile.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
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

