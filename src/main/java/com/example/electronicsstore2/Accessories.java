package com.example.electronicsstore2;

public class Accessories extends Mobile{
    private String price;
    private String color;
    private String type;

    public Accessories(String price, String color, String type) {
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    String getData() {
        String s;
        s="Price: " + price + "\n"
                +"Color: " + color + "\n"
                +"Type: " + type + "\n";
        return s;
    }
}
