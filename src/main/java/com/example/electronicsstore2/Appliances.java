package com.example.electronicsstore2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Appliances extends Product{
    protected String type;
    protected String consumption;
    protected String dimensions;
    protected String color;
    protected String size;

    public Appliances(String warranty, String price, String model, String brand, String type, String consumption, String dimensions, String color, String size) {
        super(warranty, price, model, brand);
        this.type = type;
        this.consumption = consumption;
        this.dimensions = dimensions;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getConsumption() {
        return consumption;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    String specs() {
        return "Type: " + type + "\nConsumption: " + consumption +"\n" + "Dimensions: " + dimensions + "\n" + "Color: " + color + "\nSize: " + size +"\n" ;
    }

    String getData() {
        return "Brand: " + getBrand() + "\nModel: " + getModel() + "\nPrice: " + getPrice() + "\nWarranty: " + getWarranty()+ "months";
    }
}





