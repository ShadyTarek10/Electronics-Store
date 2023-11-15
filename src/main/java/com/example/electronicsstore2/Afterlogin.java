package com.example.electronicsstore2;

import Connectivity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;

public class Afterlogin implements Initializable {
 @FXML
 private Button logoutbutton;
 @FXML
 protected TableView<laptop> tableView;
 @FXML
 protected Button ADD;
 @FXML
 protected TextField modell;
 @FXML
 protected TextField brandd;
 @FXML
 protected TextField pricee;
 @FXML
 protected TextField warrantyy;
    @FXML
    protected TextField size;
    @FXML
    protected TextField screen;
    @FXML
    protected TextField ramm;
    @FXML
    protected TextField hardd;
    @FXML
    protected TextField gpuuu;
    @FXML
    protected TextField cpuuu;
    @FXML
    protected TextField color;

    @FXML
    protected Button getdata;
    @FXML
    protected Button remove;
    @FXML
    protected Button edit;
    @FXML
    private Label GetDataLabel;
    @FXML
    protected Button refresh;





    public void userlogout(ActionEvent event) throws IOException{
        HelloApplication m=new HelloApplication();
        m.changeScene("hello-view.fxml");
    }

    public void onRefresh(ActionEvent event) throws IOException , SQLException{
        list.clear();
        ConnectionClass dc=new ConnectionClass();

        list=FXCollections.observableArrayList();
        try {
            ResultSet rs=dc.getConnection().createStatement().executeQuery("SELECT * FROM laptops");
            while (rs.next()) {
                list.add(new laptop(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8), rs.getString(9),rs.getString(10), rs.getString(11) ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        GetDataLabel.setVisible(false);
        tableView.setVisible(true);
        tableView.setItems(list);

    }


    @FXML
    public void add(ActionEvent e) throws IOException, SQLException {

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        String sql="INSERT INTO laptops (Warranty,Price,Model,Brand,Sizel,Screenl,Raml,Hard,GPU,CPU,Colorl) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1,warrantyy.getText());
        statement.setString(2,pricee.getText());
        statement.setString(3,modell.getText());
        statement.setString(4,brandd.getText());
        statement.setString(5,size.getText());
        statement.setString(6,screen.getText());
        statement.setString(7,ramm.getText());
        statement.setString(8,hardd.getText());
        statement.setString(9,gpuuu.getText());
        statement.setString(10,cpuuu.getText());
        statement.setString(11,color.getText());


        statement.execute();
        /*if(rs.next())
        {
            list.add(new laptop(warrantyy.getText(), pricee.getText(), model.getText(), brandd.getText(), size.getText(), screen.getText(), ramm.getText(), hardd.getText(), gpuuu.getText(),cpuuu.getText(), color.getText()));
        }*/


        /*Product l1=new laptop((warrantyy.getText()),(pricee.getText()),modell.getText().toString(),brandd.getText().toString());
        ObservableList<laptop> products=tableView.getItems();
        products.add((laptop) l1);
        tableView.setItems(products);*/
        GetDataLabel.setVisible(false);
        tableView.setVisible(true);

    }

    @FXML
    public void onRemove(ActionEvent event) throws IOException, SQLException {
        ResultSet rs ;
        String sql="DELETE FROM laptops WHERE Warranty=?";
        String selecteditem= String.valueOf(tableView.getSelectionModel().getSelectedItem());
        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, warrantyy.getText());

       // while(tableView.getItems().remove(selecteditem))
        //{



            statement.execute();



        //}

        int selctedid= tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(selctedid);
        GetDataLabel.setVisible(false);
        tableView.setVisible(true);
    }

    @FXML
    public void onEdit(ActionEvent event) throws IOException, SQLException {

//        ResultSet rs ;
//        String sql="UPDATE laptops SET Warranty=? , Price=?, Model=?, Brand=?, Sizel=?,Screenl=?,Raml=?, Hard=?, GPU=?, CPU=?, Colorl=? WHERE Warranty=?";

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
//        PreparedStatement statement=connection.prepareStatement(sql);
//        statement.setString(1,warrantyy.getText());
//        statement.setString(2,pricee.getText());
//        statement.setString(3,modell.getText());
//        statement.setString(4,brandd.getText());
//        statement.setString(5,size.getText());
//        statement.setString(6,screen.getText());
//        statement.setString(7,ramm.getText());
//        statement.setString(8,hardd.getText());
//        statement.setString(9,gpuuu.getText());
//        statement.setString(10,cpuuu.getText());
//        statement.setString(11,color.getText());
//        statement.execute();
//        statement.close();
        int selctedid= tableView.getSelectionModel().getSelectedIndex();
//        warrantyy.setText(warranty.getCellData(selctedid).toString());
//        pricee.setText(price.getCellData(selctedid).toString());
//        modell.setText(model.getCellData(selctedid).toString());
//        brandd.setText(brand.getCellData(selctedid).toString());
//        size.setText(sizel.getCellData(selctedid).toString());
//        screen.setText(screenl.getCellData(selctedid).toString());
//        ramm.setText(raml.getCellData(selctedid).toString());
//        hardd.setText(hard.getCellData(selctedid).toString());
//        gpuuu.setText(gpu.getCellData(selctedid).toString());
//        cpuuu.setText(cpu.getCellData(selctedid).toString());
//        color.setText(colorl.getCellData(selctedid).toString());
//        tableView.getItems().remove(selctedid);
//        GetDataLabel.setVisible(false);
//        tableView.setVisible(true);
        ResultSet rs ;
        String sql="DELETE FROM laptops WHERE Warranty=?";
        String selecteditem= String.valueOf(tableView.getSelectionModel().getSelectedItem());
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, warrantyy.getText());


        // while(tableView.getItems().remove(selecteditem))
        //{



        statement.execute();



        //}
        sql="INSERT INTO laptops (Warranty,Price,Model,Brand,Sizel,Screenl,Raml,Hard,GPU,CPU,Colorl) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        statement=connection.prepareStatement(sql);
        statement.setString(1,warrantyy.getText());
        statement.setString(2,pricee.getText());
        statement.setString(3,modell.getText());
        statement.setString(4,brandd.getText());
        statement.setString(5,size.getText());
        statement.setString(6,screen.getText());
        statement.setString(7,ramm.getText());
        statement.setString(8,hardd.getText());
        statement.setString(9,gpuuu.getText());
        statement.setString(10,cpuuu.getText());
        statement.setString(11,color.getText());


        statement.execute();
        //statement.close();





//

    }

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
        ResultSet r = st.executeQuery("select * from AdminInfo where ID = '"+currentUser+"'");
//        String ID=res.getString("ID");
        while(r.next())
            GetDataLabel.setText(r.getString(1)+"\n"+r.getString(2)+"\n"+r.getString(3)+"\n"+r.getString(4)+"\n"+r.getString(5));
        connection.close();
    }






    private Stage stg;
    private Scene scene;
    private Parent root;
    private Label l;
    Admin a = new Admin("Shady ","male","150 Years","19100178","123");
    public void onGetData(ActionEvent event) throws IOException{
      /*  Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminGetData.fxml")));
        stg=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stg.setScene(scene);
        stg.show();*/
        GetDataLabel.setVisible(true);
        tableView.setVisible(false);
      //  GetDataLabel.setText(a.GetData());

    }
  ObservableList<laptop> list = FXCollections.observableArrayList(
            new laptop("20-6-2022","40","Legion 5","Lenovo","s","s","s","s","s","s","s"),
            new laptop("20-6-2022","40","Legion 5","Lenovo","s","s","s","s","s","s","a")

            );
    TableColumn warranty=new TableColumn<>("Warranty");

    TableColumn price=new TableColumn<>("Price");

    TableColumn model=new TableColumn<>("Model");
    TableColumn  brand=new TableColumn<>("Brand");
    TableColumn  sizel=new TableColumn<>("Sizel");
    TableColumn  screenl=new TableColumn<>("Screenl");
    TableColumn  raml=new TableColumn<>("Raml");
    TableColumn  hard=new TableColumn<>("Hard");
    TableColumn  gpu=new TableColumn<>("GPU");
    TableColumn  cpu=new TableColumn<>("CPU");
    TableColumn  colorl=new TableColumn<>("Colorl");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ConnectionClass dc=new ConnectionClass();

        list=FXCollections.observableArrayList();
        try {
            ResultSet rs=dc.getConnection().createStatement().executeQuery("SELECT * FROM laptops");
            while (rs.next()) {
                list.add(new laptop(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6), rs.getString(7),rs.getString(8), rs.getString(9),rs.getString(10), rs.getString(11) ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        GetDataLabel.setVisible(false);
        tableView.setVisible(true);

        tableView.getColumns().addAll(model,price,warranty,brand,sizel,screenl,raml,hard,gpu,cpu,colorl);


        model.setCellValueFactory(new PropertyValueFactory<laptop,String>("model"));
        price.setCellValueFactory(new PropertyValueFactory<laptop,String>("price"));
        warranty.setCellValueFactory(new PropertyValueFactory<laptop,String>("warranty"));
        brand.setCellValueFactory(new PropertyValueFactory<laptop,String>("brand"));
        sizel.setCellValueFactory(new PropertyValueFactory<laptop,String>("sizel"));
        raml.setCellValueFactory(new PropertyValueFactory<laptop,String>("raml"));
        screenl.setCellValueFactory(new PropertyValueFactory<laptop,String>("screenl"));
        colorl.setCellValueFactory(new PropertyValueFactory<laptop,String>("colorl"));
        gpu.setCellValueFactory(new PropertyValueFactory<laptop,String>("gpu"));
        cpu.setCellValueFactory(new PropertyValueFactory<laptop,String>("cpu"));
        hard.setCellValueFactory(new PropertyValueFactory<laptop,String>("hard"));
        tableView.setItems(list);

    }
}
