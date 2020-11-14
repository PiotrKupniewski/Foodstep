package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.simulation.RestaurantSimulator;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    RestaurantSimulator restaurant;

    public OrderReadyToDeliver createNewOrderForCustomer() {
        Order order = new Order(1L, Order.OrderStatus.IN_PROGRESS);
        return restaurant.completeTheOrder(order);
    }
}
