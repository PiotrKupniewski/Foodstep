package pl.kupniewski.application.restaurant;

import pl.kupniewski.application.order.Order;

public interface RestaurantStorage {

    void removeOrderFromStorage(Order order);
}
