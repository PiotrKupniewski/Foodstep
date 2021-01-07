package pl.kupniewski.application.deliver;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Deprecated
public class DelivererService {

    List<OrderReadyToDeliver> ordersToDeliver;

    public void assignOrderToDeliverer(OrderReadyToDeliver orderToDeliver) {
        ordersToDeliver.add(orderToDeliver);
    }
}
