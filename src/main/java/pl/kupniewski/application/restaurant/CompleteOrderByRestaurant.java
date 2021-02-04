package pl.kupniewski.application.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.order.Order;
import pl.kupniewski.application.storages.DelivererStorage;

@Component
@AllArgsConstructor
public class CompleteOrderByRestaurant {

    DelivererStorage delivererStorage;

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        OrderReadyToDeliver orderToDeliver = new OrderReadyToDeliver(Order.Status.SEND_TO_DELIVERER, order);
        delivererStorage.assignOrderToDeliverer(orderToDeliver);
        return orderToDeliver;
    }
}
