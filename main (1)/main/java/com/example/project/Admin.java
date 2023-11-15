package com.example.project;

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

    @Override
    String GetData() {
        String s;
        s="Name"+getName()+"\n"
                +"Gender"+getGender()+"\n"
                +"Age"+getAge()+"\n"
                +"ID"+getID()+"\n"
                +"Password"+getPassword();
        return s;
    }
}
