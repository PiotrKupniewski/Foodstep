package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.order.model.OrderDto;

@AllArgsConstructor
public class ProcessCustomerOrderToRestaurant implements ProcessCustomerOrderStrategy {

    private final ProcessCustomerOrderToDeliverer orderToDeliverer;

    @Override
    public OrderDto updateOrderStatusAndProcessNextStep(OrderDto order) {
        order.setOrderStatus(OrderDto.OrderStatus.DELIVERING);
        orderToDeliverer.updateOrderStatusAndProcessNextStep(order);
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public OrderDto assignOrder(OrderDto order) {
        //assign order to restaurant
        return null;
    }
}
