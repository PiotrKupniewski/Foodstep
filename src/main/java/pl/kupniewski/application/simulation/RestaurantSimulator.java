package pl.kupniewski.application.simulation;

import org.springframework.stereotype.Component;
import pl.kupniewski.api.restaurant.CompleteOrderByRestaurant;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.usecases.order.Order;

@Component
public class RestaurantSimulator {

    CompleteOrderByRestaurant restaurantApi;

    public OrderReadyToDeliver completeTheOrder (Order order) {
        return restaurantApi.completeTheOrder(order);
    }
}
