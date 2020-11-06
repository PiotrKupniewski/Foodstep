package pl.kupniewski.application.usecases.deliver;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.PreparedOrder;

@Component
public class DeliverOrderToCustomer {
    public PreparedOrder deliverOrderToCustomer(PreparedOrder preparedOrder) {
        System.out.println("Order was delivered");
        preparedOrder.setStatus(" Order has bedd delivered");
        return preparedOrder;
    }
}
