package com.projecttwo.digitalkitchen.model;

public class Ingredient {
    private  String name;
    private double quantity;

    public Ingredient() {
    }

    public Ingredient(final String name,final double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
