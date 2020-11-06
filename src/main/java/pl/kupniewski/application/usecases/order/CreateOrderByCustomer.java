package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.Order;
import pl.kupniewski.application.usecases.order.model.CompletedOrder;
import pl.kupniewski.application.usecases.restaurant.RestaurantSimulator;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    RestaurantSimulator restaurant;

    public CompletedOrder createNewOrderForCustomer() {
        Order order = new Order();
        return restaurant.completeTheOrder(order);
    }
}
