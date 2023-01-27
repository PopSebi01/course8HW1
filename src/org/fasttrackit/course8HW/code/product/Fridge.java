package org.fasttrackit.course8HW.code.product;

import javax.swing.*;

public class Fridge extends Electronics{
    private int temperature;




   public Fridge(String name, String type, int length, int width, int height, int weight, int price, String description, int quantity, int temperature) {
        super(name, type, length, width, height, weight, price, description, quantity);
        this.temperature=temperature;
       System.out.println(quantity+" "+name+" have been delivered at the cost of "+price*quantity+"$");
    }




}
