package com.example.du_an_1.Model;

public class InvoiceDetail {
    private Integer amountFood;
    private Integer amountDrinks;
    private String disCount;
    private String timePay;
    private String idStaff;

    public void InvoiceDetailDrinks(Integer amountDrinks, String disCount, String timePay, String idStaff) {
        this.amountDrinks = amountDrinks;
        this.disCount = disCount;
        this.timePay = timePay;
        this.idStaff = idStaff;
    }

    public void InvoiceDetailFood(Integer amountFood, String disCount, String timePay, String idStaff) {
        this.amountFood = amountFood;
        this.disCount = disCount;
        this.timePay = timePay;
        this.idStaff = idStaff;
    }

    public Integer getAmountFood() {
        return amountFood;
    }

    public void setAmountFood(Integer amountFood) {
        this.amountFood = amountFood;
    }

    public Integer getAmountDrinks() {
        return amountDrinks;
    }

    public void setAmountDrinks(Integer amountDrinks) {
        this.amountDrinks = amountDrinks;
    }


    public String getDisCount() {
        return disCount;
    }

    public void setDisCount(String disCount) {
        this.disCount = disCount;
    }

    public String getTimePay() {
        return timePay;
    }

    public void setTimePay(String timePay) {
        this.timePay = timePay;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }
}