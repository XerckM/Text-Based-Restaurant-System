package restaurant;

import java.util.ArrayList;

public class Orders {
    private ArrayList<OrderItem> orderItems;
    private ArrayList<OrdersObserver> observers;

    public Orders() {
        orderItems = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        notifyObservers(orderItem);
    }

    // observer-related methods
    public void addObserver(OrdersObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(OrderItem orderItem) {
        for (OrdersObserver observer : observers) {
            observer.update(orderItem);
        }
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}