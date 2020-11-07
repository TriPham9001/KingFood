package com.example.du_an_1.Model;

public class Invoice {
    private String idInvoice;
    private String nameFood, nameDrinks;
    private Integer total;

    public void InvoiceFood(String idInvoice, String nameDrinks, Integer total) {
        this.idInvoice = idInvoice;
        this.nameDrinks = nameDrinks;
        this.total = total;
    }

    public void InvoiceDrinks(String idInvoice, String nameFood, Integer total) {
        this.idInvoice = idInvoice;
        this.nameFood = nameFood;
        this.total = total;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNameDrinks() {
        return nameDrinks;
    }

    public void setNameDrinks(String nameDrinks) {
        this.nameDrinks = nameDrinks;
    }

    public String getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
