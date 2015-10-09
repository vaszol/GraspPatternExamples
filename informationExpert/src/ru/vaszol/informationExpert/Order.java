package ru.vaszol.informationExpert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vas on 09.10.2015.
 */
public class Order {
    ArrayList<OrderItem> orderItemList;

    public Order() {
        this.orderItemList = (ArrayList<OrderItem>) new ArrayList<OrderItem>();
    }

    public int getOrderPrice(){
        int sum = 0;
        for(OrderItem m : orderItemList){
            sum += m.getOrderItemPrice();
        }
        return sum;
    }


}
