package com.example.electronicsstore2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import org.w3c.dom.events.MouseEvent;

public class Mobile extends Product{
    protected String size;
    protected String ram;
    protected String memory;
    protected String camera;
    protected String battery;
    protected String color;

    public Mobile(String model, String price, String brand, String warranty, String size,
                  String ram, String memory, String camera, String color, String battery) {
        super(warranty, price, model, brand);
        this.size = size;
        this.ram = ram;
        this.memory = memory;
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public Mobile() {}

    public String getSize() {
        return size;
    }

    public String getRam() {
        return ram;
    }

    public String getMemory() {
        return memory;
    }

    public String getCamera() {
        return camera;
    }

    public String getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }
    @Override
    String getData() {
        String s;
        s="Warranty: " + getWarranty() + "\n"
                +"Price: " + getPrice() + "\n"
                +"Model: " + getModel() + "\n"
                +"Brand: " + getBrand() + "\n";
        return s;
    }

    @Override
    String specs() {
        String s;
        s="Size: " + size + "\n"
                +"Ram: " + ram + "\n"
                +"Memory: " + memory + "\n"
                +"Camera: " + camera + "\n"
                +"Battery: " + battery + "\n"
                +"Color: " + color + "\n";
        return s;
    }

}
