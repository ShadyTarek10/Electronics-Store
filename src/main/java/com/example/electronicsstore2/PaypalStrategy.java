package com.example.electronicsstore2;

public class PaypalStrategy implements PayStratetgy {
    private String Email;
    private String Password;

    public PaypalStrategy(String email, String password){
        this.Email=email;
        this.Password=password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}
