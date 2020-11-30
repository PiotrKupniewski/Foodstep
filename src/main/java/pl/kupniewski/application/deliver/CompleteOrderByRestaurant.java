package pl.kupniewski.application.deliver;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.order.Order;

@Component
public class CompleteOrderByRestaurant {

    DeliverOrderToCustomer deliverer;

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        OrderReadyToDeliver orderToDeliver = new OrderReadyToDeliver("Send to deliverer", order);
        deliverer.assignOrder(orderToDeliver);
        return orderToDeliver;
    }
}
