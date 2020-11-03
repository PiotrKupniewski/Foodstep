package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.order.model.OrderDto;

@AllArgsConstructor
public class ProcessCustomerOrderToDeliverer implements ProcessCustomerOrderStrategy {

    private final ProcessOrderToCustomer processOrderToCustomer;


    @Override
    public OrderDto updateOrderStatusAndProcessNextStep(OrderDto order) {
        return processOrderToCustomer.assignOrder(order);
    }

    @Override
    public OrderDto assignOrder(OrderDto order) {
        return null;
    }
}
