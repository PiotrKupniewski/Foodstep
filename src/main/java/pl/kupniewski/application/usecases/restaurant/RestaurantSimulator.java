package pl.kupniewski.application.usecases.restaurant;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.deliver.DeliverOrderToCustomer;
import pl.kupniewski.application.usecases.order.model.CompletedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

@Component
public class RestaurantSimulator implements Restaurant {

    DeliverOrderToCustomer deliverer;

    @Override
    public Order assignOrder(Order order) {
        return order;
    }

    @Override
    public CompletedOrder realizeOrder(Order order) {
        return deliverer.deliverOrderToCustomer(new CompletedOrder("In progress"));
    }
}
