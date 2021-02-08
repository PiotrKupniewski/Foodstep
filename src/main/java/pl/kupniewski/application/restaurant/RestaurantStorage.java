package pl.kupniewski.application.restaurant;

import pl.kupniewski.application.order.Order;

import java.util.Map;
import java.util.UUID;

public interface RestaurantStorage {

    void removeOrderFromStorage(Order order);
    Map<UUID, Order> getActiveOrders();
}
