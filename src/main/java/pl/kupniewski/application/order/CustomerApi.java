package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerApi {

    private final CreateOrderByCustomer orderService;

    public Order createNewOrderForCustomer() {
        return orderService.createNewOrderForCustomer();
    }
}
