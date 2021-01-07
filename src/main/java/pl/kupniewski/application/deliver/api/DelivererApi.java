package pl.kupniewski.application.deliver.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.simulation.DelivererSimulator;

@AllArgsConstructor
@Component
public class DelivererApi {

    DelivererSimulator deliverer;

    public void assignOrderToDeliverer(OrderReadyToDeliver orderToDeliver) {
        deliverer.getOrdersToDeliver().add(orderToDeliver);
    }

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return new OrderReadyToDeliver("Order has been delivered", orderToDeliver.getOrder());
    }
}
