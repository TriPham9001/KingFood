package com.example.duan1.Model;

public class ProductFood {
    private String nameFood;
    private String codeFood;
    private Double priceFood;
    private String describeFood;
    private byte[] imagesFood;

    public ProductFood() {
    }

    public ProductFood(String nameFood, String codeFood, Double priceFood, String describeFood, byte[] imagesFood) {
        this.nameFood = nameFood;
        this.codeFood = codeFood;
        this.priceFood = priceFood;
        this.describeFood = describeFood;
        this.imagesFood = imagesFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getCodeFood() {
        return codeFood;
    }

    public void setCodeFood(String codeFood) {
        this.codeFood = codeFood;
    }

    public Double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(Double priceFood) {
        this.priceFood = priceFood;
    }

    public String getDescribeFood() {
        return describeFood;
    }

    public void setDescribeFood(String describeFood) {
        this.describeFood = describeFood;
    }

    public byte[] getImagesFood() {
        return imagesFood;
    }

    public void setImagesFood(byte[] imagesFod) {
        this.imagesFood = imagesFood;
    }
}
