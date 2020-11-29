package pl.kupniewski.application.deliver;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeliverOrderToCustomer {

    List<OrderReadyToDeliver> ordersToDeliverList;

    public void assignOrder(OrderReadyToDeliver orderToDeliver) {
        ordersToDeliverList.add(orderToDeliver);
    }
}
