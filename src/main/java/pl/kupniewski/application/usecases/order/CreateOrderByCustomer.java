package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.deliver.CompleteOrderByRestaurant;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

     CompleteOrderByRestaurant restaurantApi;

    public OrderReadyToDeliver createNewOrderForCustomer() {
        Order order = new Order(1L, Order.OrderStatus.IN_PROGRESS);
        return restaurantApi.assignOrderToDeliverer(order);
    }
}
