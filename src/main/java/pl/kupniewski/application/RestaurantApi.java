package pl.kupniewski.application;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.CompleteOrderByRestaurant;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.order.Order;

import java.util.List;

@AllArgsConstructor
@Component
public class RestaurantApi {

    private final List<Order> ordersList;
    private final CompleteOrderByRestaurant completedOrder;

    public OrderReadyToDeliver completeOrderByRestaurant(Order order) {
        return completedOrder.assignOrderToDeliverer(order);
    }

    public void addOrderToList(Order order) {
        ordersList.add(order);
    }

    public List<Order> getActiveOrders() {
        return ordersList;
    }
}
