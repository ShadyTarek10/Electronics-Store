package com.example.project;

import java.util.*;
public class Customer extends Person {
    private String CustomerID;
    private String Password;
    private ArrayList<String> Address=new ArrayList<>();
    private PayStratetgy  PaymentMethods;
    private double Balance;

    public Customer(String name, String gender, String age, String customerID, String password, ArrayList<String> address, PayStratetgy paymentMethods, double balance) {
        super(name, gender, age);
        CustomerID = customerID;
        Password = password;
        Address = address;
        PaymentMethods = paymentMethods;
        Balance = balance;
    }


    public void ChangePassword(String password){
        Password=password;
    }
    public void AddAddress(String a){
        Address.add(a);

    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getPassword() {
        return Password;
    }

    public ArrayList<String> getAddress() {
        return Address;
    }

    public PayStratetgy getPaymentMethods() {
        return PaymentMethods;
    }

    public double getBalance() {
        return Balance;
    }

    public void setAddress(ArrayList<String> address) {
        Address = address;
    }

    public void setPaymentMethods(PayStratetgy paymentMethods) {
        PaymentMethods = paymentMethods;
    }
    @Override
    String GetData() {
        String s;
        s="Name"+getName()+"\n"
                +"Gender"+getGender()+"\n"
                +"Age"+getAge()+"\n"
                +"Address"+getAddress()+"\n"
                +"CustomerID"+getCustomerID()+"\n"
                +"Password"+getPassword()+"\n"
                +"Balance"+getBalance()+"\n"
                +"PaymentMethods"+getPaymentMethods();
        return s;


    }






}
