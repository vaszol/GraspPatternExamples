package ru.vaszol.informationExpert;

/**
 * Created by vas on 09.10.2015.
 */
public class OrderItem {
    Good good;
    int emount;

    public OrderItem() {
        this.good = new Good();
        this.emount = 3;
    }

    public int getOrderItemPrice(){
        return good.getGoodPrice()*emount;
    }
}
