package com.example.electronicsstore2;

public class Televisions extends Appliances{
    private String resolution;
    private String refreshRate;
    private String Memory;
    private String Weight;

    public Televisions(String warranty, String price, String model, String brand, String type, String consumption, String dimensions, String color, String size, String resolution, String refreshRate, String memory, String weight) {
        super(warranty, price, model, brand, type, consumption, dimensions, color, size);
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        Memory = memory;
        Weight = weight;
    }

    public String getResolution() {
        return resolution;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public String getMemory() {
        return Memory;
    }

    public String getWeight() {
        return Weight;
    }
    String specs()
    {
        return "Type: " + type + "\nConsumption: " + consumption +"\n" + "Dimensions: " + dimensions + "\n" + "Color: " + color + "\nSize: " + size +"\n" ;
    }
    String getData()
    {
        return "Brand: " + getBrand() + "\nModel: " + getModel() + "\nPrice: " + getPrice() + "\nWarranty: " + getWarranty()+ "months";
    }
}
