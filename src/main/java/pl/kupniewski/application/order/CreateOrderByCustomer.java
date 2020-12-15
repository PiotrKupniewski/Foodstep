package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.api.OrderStorage;
import pl.kupniewski.application.order.Order.Status;

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
