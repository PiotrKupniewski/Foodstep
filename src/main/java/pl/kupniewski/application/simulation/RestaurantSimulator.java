package pl.kupniewski.application.simulation;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.deliver.DeliverOrderToCustomer;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.usecases.order.Order;

@Component
public class RestaurantSimulator implements Restaurant {

    DeliverOrderToCustomer deliverer;

    @Override
    public OrderReadyToDeliver completeTheOrder (Order order) {
        return deliverer.deliverOrderToCustomer(new OrderReadyToDeliver("Send to deliverer"));
    }
}
