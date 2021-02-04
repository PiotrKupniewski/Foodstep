package pl.kupniewski.application.storages;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;

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
