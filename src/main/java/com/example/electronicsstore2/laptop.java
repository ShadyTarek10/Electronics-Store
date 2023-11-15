package com.example.electronicsstore2;

public class laptop extends Product{
    protected String sizel;
    protected String screenl;
    protected String raml;
    protected String hard;
    protected String GPU;
    protected String CPU;
    protected String colorl;

    public laptop(String warranty, String price, String model, String brand, String sizel,
                  String screenl, String raml, String hard, String GPU, String CPU, String colorl) {
        super(warranty, price, model, brand);
        this.sizel = sizel;
        this.screenl = screenl;
        this.raml = raml;
        this.hard = hard;
        this.GPU = GPU;
        this.CPU = CPU;
        this.colorl = colorl;
    }

    public laptop(String warranty, String price, String model, String brand) {
        super(warranty, price, model, brand);
    }

    public laptop() {}

    public String getSizel() {
        return sizel;
    }

    public String getScreenl() {
        return screenl;
    }

    public String getRaml() {
        return raml;
    }

    public String getHard() {
        return hard;
    }

    public String getGPU() {
        return GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public String getColorl() {
        return colorl;
    }

    @Override
    String getData() {
        String s;
        s=       "Brand: " + getBrand() + "\n"
                +"Model: " + getModel() + "\n"
                +"Price: " + getPrice() + " EGP\n"
                +"Warranty: " + getWarranty() + "\n";
        return s;
    }

    @Override
    String specs() {
        String s;
        s="Size: " + sizel + "\n"
                +"Screen: " + screenl + "\n"
                +"Ram: " + raml + "\n"
                +"Hard: " + hard + "\n"
                +"GPU: " + GPU + "\n"
                +"CPU: " + CPU + "\n"
                +"Color: " + colorl + "\n";
        return s;
    }
}

