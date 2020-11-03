package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.deliver.DeliverOrderToCustomer;
import pl.kupniewski.application.usecases.order.model.OrderDto;

@AllArgsConstructor
public class ProcessCustomerOrder {

    private final DeliverOrderToCustomer deliverOrderToCustomer;

    public OrderDto assignCustomerOrderToRestaurant() {

        updateOrderStatus(OrderDto.OrderStatus.IN_PROGRESS);
        //prepare order
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    protected OrderDto assignOrderToDeliverer() {

        deliverOrderToCustomer.assignOrderToDeliverer();
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    protected OrderDto updateOrderStatus(OrderDto.OrderStatus orderStatus) {
        //send message to user after every order status update
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
