package ru.vaszol.informationExpert;

/**
 * Created by vas on 09.10.2015.
 */
public class Good {
    private String name;
    private int price;

    public Good() {
        this.name = "Paper";
        this.price = 5;
    }

    public int getGoodPrice() {
        return price;
    }
}
