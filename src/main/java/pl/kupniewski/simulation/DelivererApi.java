package pl.kupniewski.simulation;

import pl.kupniewski.application.deliver.OrderReadyToDeliver;

public class DelivererApi {

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return new OrderReadyToDeliver("Order has been delivered", orderToDeliver.getOrder());
    }
}
