package pl.kupniewski.application.usecases.rustleup;

import pl.kupniewski.application.usecases.order.model.OrderDto;

public class ProcessOrderToCustomer implements ProcessCustomerOrderStrategy {
    @Override
    public OrderDto updateOrderStatusAndProcessNextStep(OrderDto order) {
        return null;
    }

    @Override
    public OrderDto assignOrder(OrderDto order) {
        return null;
    }
}
