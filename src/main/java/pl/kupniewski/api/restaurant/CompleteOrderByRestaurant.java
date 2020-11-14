package pl.kupniewski.api.restaurant;

import pl.kupniewski.application.usecases.deliver.DeliverOrderToCustomer;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.usecases.order.Order;

public class CompleteOrderByRestaurant {

    DeliverOrderToCustomer deliverer;

    public OrderReadyToDeliver completeTheOrder (Order order) {
        return deliverer.deliverOrderToCustomer(new OrderReadyToDeliver("Send to deliverer", order));
    }

}
