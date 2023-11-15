package com.example.electronicsstore2;

import java.util.*;
public class Customer extends Person {
    private String CustomerID;
    private String Password;
    private String Address;
    private String Paymentype;
   // private PayStratetgy  PaymentMethods;
    private double Balance;
    PaymentContext ctx=new PaymentContext();


    public Customer(String name, String gender, String age, String customerID, String password, String address, String paymentype, double balance) {
        super(name, gender, age);
        CustomerID = customerID;
        Password = password;
        Address =address;
        Paymentype=paymentype;
        if("CreditCard".equalsIgnoreCase(paymentype) )
        {
            ctx.setPaymentStrategy(new CreditCardStrategy("shady","550","123","30-6-2025"));
        }
        else if("Paypal".equalsIgnoreCase(paymentype))
        {
            ctx.setPaymentStrategy(new PaypalStrategy("shady","550"));
        }

       // PayStratetgy paymentMethods1= paymentMethods;
        Balance = balance;
    }


    public void ChangePassword(String password){
        Password=password;
    }
    public void AddAddress(String a){


    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getPassword() {
        return Password;
    }

    public String getAddress() {
        return Address;
    }

    public PayStratetgy getPaymentMethods() {

        return ctx.getPaymentStrategy();
    }

    public double getBalance() {
        return Balance;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPaymentMethods(PayStratetgy paymentMethods) {
        PayStratetgy PaymentMethods = paymentMethods;
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
                +"PaymentMethods" + ctx.getPaymentStrategy() ;
        return s;


    }
    public void pay(PayStratetgy m)
    {
        m.pay(15);
    }






}
