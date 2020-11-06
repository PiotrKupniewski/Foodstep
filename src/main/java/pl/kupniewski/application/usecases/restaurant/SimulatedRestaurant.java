package pl.kupniewski.application.usecases.restaurant;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.PreparedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

@Component
public class SimulatedRestaurant implements Restaurant {
    @Override
    public Order assignOrder(Order order) {
        return null;
    }

    @Override
    public PreparedOrder realizeOrder(Order order) {
        return null;
    }
}
