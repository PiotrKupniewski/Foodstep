package pl.kupniewski.simulation;

import pl.kupniewski.application.deliver.OrderReadyToDeliver;

public class DelivererSimulator {

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return new OrderReadyToDeliver("Orde has been delivered", orderToDeliver.getOrder() );
    }

}
