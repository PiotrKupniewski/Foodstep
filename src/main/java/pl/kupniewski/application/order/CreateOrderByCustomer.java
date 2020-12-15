package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.api.RestaurantApi;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    RestaurantApi restaurant;

    public Order createNewOrderForCustomer() {
        Order order = new Order(1L, Order.Status.IN_PROGRESS);
        restaurant.addOrderToRestaurantList(order);
        return order;
    }
}
