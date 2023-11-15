package com.example.electronicsstore2;

import Connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;

public class UserPage implements Initializable {

    @FXML
    private MenuItem close;
 @FXML
    private MenuItem setting;
 @FXML
 private Button getdata;
 @FXML
 private Button changepass;
 @FXML
 private Button address;
@FXML
private Button logout;

@FXML
private Label yourdata;
@FXML
private Label Datalabel;
    @FXML
    private Label id;
    @FXML
    private Label newpass;
    @FXML
    private TextField Id;
    @FXML
    private TextField newpassf;
    @FXML
    private TextField addresst;
    @FXML
    private Label addressl;
    @FXML
    private Button done;
    @FXML
    private Button doneadd;
    @FXML
    private Label oldadd;
    @FXML
    private TextField oldaddt;
    @FXML
    private Button store;
    @FXML
    private Label labelcust;

    public static String s;



Customer c1=new Customer("  shady","  male","  25","  19123456","  123","  SMOUHA" , "CreditCard",20);


    public void initData(String currentUser) throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        HelloApplication h=new HelloApplication();
//        String sql="SELECT * FROM AdminInfo where ID = '"+currentUser+"';";
//
//        PreparedStatement statement=connection.prepareStatement(sql);
//
//        ResultSet res=  statement.executeQuery();
        Statement st = connection.createStatement();
        ResultSet r = st.executeQuery("select * from customerinfo where CustomerID = '"+currentUser+"'");
//        String ID=res.getString("ID");
        while(r.next())
            Datalabel.setText(r.getString(1)+"\n"+r.getString(2)+"\n"+r.getString(3)+"\n"+r.getString(4));
        connection.close();
    }

    public  void onDoneAdd(ActionEvent event) throws IOException, SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        String sql="SELECT * FROM customerinfo where  Address= '" +oldaddt.getText()+"';";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        if(resultSet.next())
        {
     /*  String sql1="DELETE FROM customerinfo WHERE Password=?";
        PreparedStatement statement1=connection.prepareStatement(sql1);
        statement1.setString(1, oldpassf.getText());
        statement1.close();*/
            String sql2="UPDATE  customerinfo SET Address=? WHERE Address= '" +oldaddt.getText()+"'";
            PreparedStatement statement1=connection.prepareStatement(sql2);
            statement1.setString(1,addresst.getText());
            statement1.execute();

            statement1.close();
        }
        else
        {
            Alert a=new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error Alert Dialog");
            a.setContentText("Please enter your Password correctly");
            a.showAndWait();
        }
        labelcust.setVisible(false);



    }





public void onGetData(ActionEvent event) throws IOException
{
    id.setVisible(false);
    newpass.setVisible(false);
    Id.setVisible(false);
    newpassf.setVisible(false);
    addressl.setVisible(false);
    addresst.setVisible(false);
 yourdata.setVisible(true);
 Datalabel.setVisible(true);
    done.setVisible(false);

    oldadd.setVisible(false);
    oldaddt.setVisible(false);
    doneadd.setVisible(false);
    labelcust.setVisible(false);
    labelcust.setVisible(true);

// Datalabel.setText(c1.GetData());


}

public void onDone(ActionEvent event) throws IOException, SQLException {
    ConnectionClass connectionClass=new ConnectionClass();
    Connection connection=connectionClass.getConnection();
    String sql="SELECT * FROM customerinfo where  CustomerID= '" +Id.getText()+"';";
    Statement statement=connection.createStatement();
    ResultSet resultSet=statement.executeQuery(sql);
    if(resultSet.next())
    {
     /*  String sql1="DELETE FROM customerinfo WHERE Password=?";
        PreparedStatement statement1=connection.prepareStatement(sql1);
        statement1.setString(1, oldpassf.getText());
        statement1.close();*/
        String sql2="UPDATE  customerinfo SET Password=? WHERE CustomerID= '" +Id.getText()+"'";
       PreparedStatement statement1=connection.prepareStatement(sql2);
        statement1.setString(1,newpassf.getText());
        statement1.execute();

        statement1.close();
    }
    else
    {
        Alert a=new Alert(Alert.AlertType.ERROR);
        a.setTitle("Error Alert Dialog");
        a.setContentText("Please enter your Password correctly");
        a.showAndWait();
    }
    Datalabel.setVisible(false);

    oldadd.setVisible(false);
    oldaddt.setVisible(false);
    doneadd.setVisible(false);
    labelcust.setVisible(false);

}




public  void onChangePass(ActionEvent event) throws IOException, SQLException {



    yourdata.setVisible(false);
    Datalabel.setVisible(false);
    id.setVisible(true);
    newpass.setVisible(true);
    Id.setVisible(true);
    newpassf.setVisible(true);
    addressl.setVisible(false);
    addresst.setVisible(false);
    done.setVisible(true);

    oldadd.setVisible(false);
    oldaddt.setVisible(false);
    doneadd.setVisible(false);
    labelcust.setVisible(false);



}
public void onAddress(ActionEvent event) throws IOException{
    yourdata.setVisible(false);
    Datalabel.setVisible(false);
    addressl.setVisible(true);
    addresst.setVisible(true);
    id.setVisible(false);
    newpass.setVisible(false);
    Id.setVisible(false);
    newpassf.setVisible(false);
    done.setVisible(false);

    oldadd.setVisible(true);
    oldaddt.setVisible(true);
    doneadd.setVisible(true);
    labelcust.setVisible(false);




}


 public void onSettings(ActionEvent event) throws IOException {

 }
    public void onClose(ActionEvent event) throws  IOException{


     System.exit(0);

    }


    private Stage stg;
    private Scene scene;
    private Parent root;
    public void onLogout(ActionEvent event) throws IOException{

        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("customerlogin.fxml")));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        yourdata.setVisible(false);
        Datalabel.setVisible(false);
        id.setVisible(false);
        newpass.setVisible(false);
        Id.setVisible(false);
        newpassf.setVisible(false);
        addressl.setVisible(false);
        addresst.setVisible(false);
        done.setVisible(false);
        oldadd.setVisible(false);
        oldaddt.setVisible(false);
        doneadd.setVisible(false);
        labelcust.setVisible(false);
        labelcust.setText(c1.GetData());
    }
    public void str(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mobile.fxml"));
        stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
    }
}
