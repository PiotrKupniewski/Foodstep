package pl.kupniewski.application.usecases.deliver;

import org.springframework.stereotype.Component;

@Component
public class DeliverOrderToCustomer {
    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return new OrderReadyToDeliver("Orde has been delivered", orderToDeliver.getOrder() );
    }
}