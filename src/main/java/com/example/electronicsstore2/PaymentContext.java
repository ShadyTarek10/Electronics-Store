package com.example.electronicsstore2;

public class PaymentContext {
    private PayStratetgy  PaymentMethods;
    public void setPaymentStrategy(PayStratetgy strategy)
    {
        this.PaymentMethods=strategy;
    }

    public PayStratetgy getPaymentStrategy()
    {
        return PaymentMethods;
    }
    public void pay(String amount)
    {
        PaymentMethods.pay(Integer.parseInt(amount));
    }
}
