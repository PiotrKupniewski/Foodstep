package pl.kupniewski.application.deliver.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.order.Order;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Getter
@Component
@AllArgsConstructor
public class OrderStorage {

    private final Map<UUID, Order> ordersStorage;

    protected String removeOrderFromStorage(Order order) {
        Optional.ofNullable(order).orElseThrow(() -> new UnsupportedOperationException("Cannot add empty order"));
        ordersStorage.remove(order.getOrderId());
        return "Order deleted!";
    }

    public String addNewOrderToStorage(Order order) {
        ordersStorage.put(order.getOrderId(), order);
        return "Order added!";
    }

}
