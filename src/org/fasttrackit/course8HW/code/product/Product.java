package org.fasttrackit.course8HW.code.product;

public class Product {
    private int price;
    private String name;
    private String description;
    private int quantity;

    Product(String name, int price, String description, int quantity){
        this.name=name;
        this.price=price;
        this.description=description;
        this.quantity=quantity;
    }

    public String getDescription(){
        return description;
    }
}
