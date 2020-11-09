package com.example.du_an_1.Model;

public class Food {
    private String idFood;
    private String nameFood;
    private byte[] pictureFood;
    private int priceFood;
    private String evaluateFood;
    private String describeFood;

    public Food() {
    }

    public Food(String nameFood) {
        this.nameFood = nameFood;
    }

    public Food(String idFood, String nameFood, byte[] pictureFood, int priceFood, String evaluateFood, String describeFood) {
        this.idFood = idFood;
        this.nameFood = nameFood;
        this.pictureFood = pictureFood;
        this.priceFood = priceFood;
        this.evaluateFood = evaluateFood;
        this.describeFood = describeFood;
    }

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public byte[] getPictureFood() {
        return pictureFood;
    }

    public void setPictureFood(byte[] pictureFood) {
        this.pictureFood = pictureFood;
    }

    public int getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(int priceFood) {
        this.priceFood = priceFood;
    }

    public String getEvaluateFood() {
        return evaluateFood;
    }

    public void setEvaluateFood(String evaluateFood) {
        this.evaluateFood = evaluateFood;
    }

    public String getDescribeFood() {
        return describeFood;
    }

    public void setDescribeFood(String describeFood) {
        this.describeFood = describeFood;
    }
}
