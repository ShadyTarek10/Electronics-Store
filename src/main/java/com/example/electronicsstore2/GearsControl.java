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

public class GearsControl implements Initializable {
    Gears[] g = { new Gears("600", "White", "Wireless","Logitech G305"), new Gears("400", "Black", "Wired","RedRagon m910"),
            new Gears("2200", "Black RGB", "Wired","Logitech G Pro"), new Gears("550", "White RGB", "Wired Gaming","Redragon k552"),
            new Gears("1500", "Black", "Wired","CoolerMaster MH751"), new Gears("2500", "Black & Red", "Wireless","HyperX cloud 2"),
            new Gears("3200", "Black", " 24 inch 165Hz","Acer Nitro"), new Gears("4500", "Black", " 24 Inch 144Hz","BenQ Zowie XL2411K")
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
        label1.setText(g[5].getData());
        label2.setText(g[2].getData());
        label3.setText(g[4].getData());
        label4.setText(g[3].getData());
        label5.setText(g[7].getData());
        label6.setText(g[1].getData());
        label7.setText(g[0].getData());
        label8.setText(g[6].getData());
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
    public void Acc(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Accessories.fxml"));
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
