package pl.kupniewski.application.deliver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
@AllArgsConstructor
public class DelivererStorage {

    private final Map<UUID, OrderReadyToDeliver> delivererStorage;

    public void assignOrderToDeliverer(OrderReadyToDeliver orderToDeliver) {
        delivererStorage.put(orderToDeliver.getOrder().getOrderId(), orderToDeliver);
    }

    public Map<UUID, OrderReadyToDeliver> getActiveOrder() {
        return delivererStorage;
    }
}
