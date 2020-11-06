package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.Order;

@AllArgsConstructor
@Component
public class CreateOrderByCustomer {

    public Order createNewOrderForCustomer() {
        Order order = new Order();
        return order;
    }
}
