package pl.kupniewski.application.usecases.deliver;

import pl.kupniewski.application.usecases.order.Order;

public class CompleteOrderByRestaurant {

    DeliverOrderToCustomer deliverer;

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        return deliverer.deliverOrderToCustomer(new OrderReadyToDeliver("Send to deliverer", order));
    }

}
