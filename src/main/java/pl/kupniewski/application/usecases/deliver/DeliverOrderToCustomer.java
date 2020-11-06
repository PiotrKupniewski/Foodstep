package pl.kupniewski.application.usecases.deliver;

import org.springframework.stereotype.Component;
import pl.kupniewski.application.usecases.order.model.CompletedOrder;

@Component
public class DeliverOrderToCustomer {
    public CompletedOrder deliverOrderToCustomer(CompletedOrder completedOrder) {
        System.out.println("Order was delivered");
        completedOrder.setStatus(" Order has bedd delivered");
        return completedOrder;
    }
}
