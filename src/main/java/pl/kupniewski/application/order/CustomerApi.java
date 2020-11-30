package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerApi {

    private CreateOrderByCustomer customer;

    public Order createNewOrderForCustomer(){
        return customer.createNewOrderForCustomer();
    }
}
