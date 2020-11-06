package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.Order;
import pl.kupniewski.application.usecases.order.model.PreparedOrder;
import pl.kupniewski.application.usecases.restaurant.SimulatedRestaurant;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    SimulatedRestaurant restaurant;

    public PreparedOrder createNewOrderForCustomer() {
        Order order = new Order();
        return restaurant.assignOrder(order);
    }
}
