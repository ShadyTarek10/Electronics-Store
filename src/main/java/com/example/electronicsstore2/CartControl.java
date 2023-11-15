package com.example.electronicsstore2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CartControl implements Cart, Initializable {
    String s="";
    @FXML
    protected TextField order;
    @FXML
    protected Label l;
    @FXML
    protected Button a;
    @FXML
    protected Button r;
    @FXML
    protected Button c;
    @FXML
    protected Button bb;
    @Override
    public void addToCart() {
        s=s+" "+order.getText();
    }
    String t="";
    @Override
    public void RemoveFromCart() {
        if(s.contains(order.getText())){
            t=s.substring(0,s.indexOf(order.getText()));
            t+=s.substring(s.indexOf(order.getText())+order.getText().length());
            s=t;
            t="";
        }
    }
    public void bck(ActionEvent e){
        a.setVisible(true);
        order.setVisible(true);
        r.setVisible(true);
        c.setVisible(true);
        l.setVisible(false);
        bb.setVisible(false);
    }

    @Override
    public void CheckOut() {
        String st[]=s.split(" ");
        String aa="";
        for(int i=0;i<st.length;i++){
            aa+=st[i]+"\n";
        }

        l.setText(aa);
        l.setVisible(true);
        a.setVisible(false);
        r.setVisible(false);
        order.setVisible(false);
        c.setVisible(false);
        bb.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        l.setVisible(false);
        bb.setVisible(false);
    }
}
