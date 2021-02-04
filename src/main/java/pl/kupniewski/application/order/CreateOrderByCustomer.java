package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.order.Order.Status;
import pl.kupniewski.application.storages.OrderStorage;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    private final OrderStorage orderStorage;
    public Order createNewOrderForCustomer() {
        Order order = new Order(Status.IN_PROGRESS);
        orderStorage.addNewOrderToStorage(order);
        return order;
    }
}
