package pl.kupniewski.application.usecases.deliver;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.PreparedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

@Component
public class DeliverOrderToCustomer {
    public PreparedOrder deliverOrderToCustomer(PreparedOrder preparedOrder) {
        System.out.println("Order was delivered");
        return preparedOrder;
    }
}
