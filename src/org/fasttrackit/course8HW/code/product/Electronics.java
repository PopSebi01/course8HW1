package org.fasttrackit.course8HW.code.product;

public class Electronics extends Product{
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;
    Electronics(String name, String type, int length, int width, int height, int weight, int price, String description, int quantity) {
        super(name, price, description, quantity);
        this.type=type;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;

    }
}
