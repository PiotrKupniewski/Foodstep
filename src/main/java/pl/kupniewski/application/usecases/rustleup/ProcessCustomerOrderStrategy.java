package pl.kupniewski.application.usecases.rustleup;

import pl.kupniewski.application.usecases.order.model.OrderDto;

public interface ProcessCustomerOrderStrategy {

    OrderDto updateOrderStatusAndProcessNextStep(OrderDto order);

    OrderDto assignOrder(OrderDto order);
}
