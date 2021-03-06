package pl.kupniewski.application.storages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.order.CustomerOrdersStorage;
import pl.kupniewski.application.order.Order;
import pl.kupniewski.application.restaurant.RestaurantOrdersStorage;

import java.util.Map;
import java.util.UUID;

@Getter
@Component
@AllArgsConstructor
public class OrderStorage implements CustomerOrdersStorage, RestaurantOrdersStorage {

    private final Map<UUID, Order> ordersStorage;

    @Override
    public void removeOrderFromStorage(Order order) {
        ordersStorage.remove(order.getOrderId());
    }

    @Override
    public void addNewOrderToStorage(Order order) {
        ordersStorage.values()
                .forEach(System.out::println);

        ordersStorage.put(order.getOrderId(), order);
    }

    @Override
    public Map<UUID, Order> getRestaurantOrders() {
        return ordersStorage;
    }

}

