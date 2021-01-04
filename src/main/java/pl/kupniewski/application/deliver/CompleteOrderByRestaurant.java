package pl.kupniewski.application.deliver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.api.DelivererApi;
import pl.kupniewski.application.order.Order;

@Component
@AllArgsConstructor
public class CompleteOrderByRestaurant {

    DelivererApi delivererApi;

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        OrderReadyToDeliver orderToDeliver = new OrderReadyToDeliver("Send to deliverer", order);
        delivererApi.assignOrderToDeliverer(orderToDeliver);
        return orderToDeliver;
    }
}
