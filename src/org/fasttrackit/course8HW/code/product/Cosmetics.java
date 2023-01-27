package org.fasttrackit.course8HW.code.product;

public class Cosmetics extends Product{
    private String color;
    private int weight;




   public Cosmetics(String name, int price, String description, int quantity, String color, int weight) {
        super(name, price, description, quantity);
        this.color=color;
        this.weight=weight;
    }
}
