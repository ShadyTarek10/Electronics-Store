package com.example.electronicsstore2;

public class Gears extends laptop{
    private String priceG;
    private String coloG;
    private String typeG;
    private String modelG;

    public Gears(String priceG, String coloG, String typeG, String modelG) {
        this.priceG = priceG;
        this.coloG = coloG;
        this.typeG = typeG;
        this.modelG = modelG;
    }
    @Override
    public String getData()
    {
        String s;
        s="Price"+getPriceG()+"\n"+
           "Color"+getColoG()+"\n"+
            "Type"+getTypeG()+"\n"+
                "Model"+getModelG();
        return s;
    }


    public String getPriceG() {
        return priceG;
    }

    public String getColoG() {
        return coloG;
    }

    public String getTypeG() {
        return typeG;
    }

    public String getModelG() {
        return modelG;
    }
}
