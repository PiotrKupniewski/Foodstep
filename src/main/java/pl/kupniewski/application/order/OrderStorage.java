package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Getter
@Component
@AllArgsConstructor
public class OrderStorage {

    private final Map<UUID, Order> ordersStorage;

    public void removeOrderFromStorage(Order order) {
        ordersStorage.remove(order.getOrderId());
    }

    public void addNewOrderToStorage(Order order) {
        ordersStorage.values()
                .stream()
                .forEach(System.out::println);

        ordersStorage.put(order.getOrderId(), order);
    }

}
