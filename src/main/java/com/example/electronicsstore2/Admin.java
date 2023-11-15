package com.example.electronicsstore2;
import java.util.*;
public class Admin extends Person {
    private  String ID;
    private String password;
    public void AddProduct(){}
    public void EditProduct(){}
    public void RemoveProduct(){}
    public String getID(){
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public Admin(String name, String gender, String age, String ID, String password) {
        super(name, gender, age);
        this.ID = ID;
        this.password = password;
    }

    @Override
    String GetData() {
        String s;
        s="Name"+getName()+"\n"
            +"Gender"+getGender()+"\n"
            +"Age"+getAge()+"\n"
            +"ID"+getID()+"\n";
        return s;
    }
}
