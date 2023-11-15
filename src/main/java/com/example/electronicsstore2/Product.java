package com.example.electronicsstore2;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableColumn;

abstract class Product {
    protected SimpleStringProperty warranty;
    protected SimpleStringProperty price;
    protected SimpleStringProperty model;
    protected SimpleStringProperty brand;

    public Product(String warranty, String price, String model, String brand) {
        this.warranty = new SimpleStringProperty(warranty);
        this.price = new SimpleStringProperty(price);
        this.model = new SimpleStringProperty(model);
        this.brand = new SimpleStringProperty(brand);
    }



    public String getModel() {
        return model.get();
    }

    public String getWarranty() {
        return warranty.get();
    }

    public String getPrice() {
        return price.get();
    }

    public String getBrand() {
        return brand.get();
    }

    abstract String specs();
    abstract String getData();

    public Product() {}
}
