package pl.kupniewski.application.usecases.restaurant;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.deliver.DeliverOrderToCustomer;
import pl.kupniewski.application.usecases.order.model.PreparedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

@Component
public class SimulatedRestaurant implements Restaurant {

    DeliverOrderToCustomer deliverer;

    @Override
    public PreparedOrder assignOrder(Order order) {
        return realizeOrder(order);
    }

    @Override
    public PreparedOrder realizeOrder(Order order) {
        return deliverer.deliverOrderToCustomer(new PreparedOrder("In progress"));
    }
}
