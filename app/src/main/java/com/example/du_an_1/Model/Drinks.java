package com.example.du_an_1.Model;

public class Drinks {
    private String idDrinks;
    private String nameDrinks;
    private byte[] pictureDrinks;
    private int priceDrinks;
    private String evaluateDrinks;
    private String describeDrinks;

    public Drinks(String idDrinks, String nameDrinks, byte[] pictureDrinks, int priceDrinks, String evaluateDrinks, String describeDrinks) {
        this.idDrinks = idDrinks;
        this.nameDrinks = nameDrinks;
        this.pictureDrinks = pictureDrinks;
        this.priceDrinks = priceDrinks;
        this.evaluateDrinks = evaluateDrinks;
        this.describeDrinks = describeDrinks;
    }

    public String getIdDrinks() {
        return idDrinks;
    }

    public void setIdDrinks(String idDrinks) {
        this.idDrinks = idDrinks;
    }

    public String getNameDrinks() {
        return nameDrinks;
    }

    public void setNameDrinks(String nameDrinks) {
        this.nameDrinks = nameDrinks;
    }

    public byte[] getPictureDrinks() {
        return pictureDrinks;
    }

    public void setPictureDrinks(byte[] pictureDrinks) {
        this.pictureDrinks = pictureDrinks;
    }

    public int getPriceDrinks() {
        return priceDrinks;
    }

    public void setPriceDrinks(int priceDrinks) {
        this.priceDrinks = priceDrinks;
    }

    public String getEvaluateDrinks() {
        return evaluateDrinks;
    }

    public void setEvaluateDrinks(String evaluateDrinks) {
        this.evaluateDrinks = evaluateDrinks;
    }

    public String getDescribeDrinks() {
        return describeDrinks;
    }

    public void setDescribeDrinks(String describeDrinks) {
        this.describeDrinks = describeDrinks;
    }
}
