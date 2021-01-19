package pl.kupniewski.application.deliver.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.DelivererStorage;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Component
public class DelivererApi {

    DelivererStorage delivererStorage;

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver orderToDeliver) {
        return getActiverders().get(orderToDeliver.getOrder().getOrderId());
    }

    public Map<UUID, OrderReadyToDeliver> getActiverders(){
        return delivererStorage.getActiveOrder();
    }
}
