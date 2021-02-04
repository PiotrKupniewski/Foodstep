package pl.kupniewski.application.deliver;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.storages.DelivererStorage;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class DelivererApi {

    DelivererStorage delivererStorage;

    public OrderReadyToDeliver deliverOrderToCustomer(OrderReadyToDeliver order) {
        return order.markOrderAsDelivered();
    }

    @Deprecated
    public Map<UUID, OrderReadyToDeliver> getActiverders(){
        return delivererStorage.getActiveOrder();
    }

    public List<OrderReadyToDeliver> getActiverdersList(){
        return delivererStorage.getActiveOrder()
                .values()
                .stream()
                .collect(Collectors.toList());
    }
}
