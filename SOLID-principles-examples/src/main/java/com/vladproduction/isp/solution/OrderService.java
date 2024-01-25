package com.vladproduction.isp.solution;

public interface OrderService {

    Order createOrder();
    Order updateOrder();
    boolean cancelOrder(int id);
    Order submitOrder(int id);
    Order getOrder(int id);


}
