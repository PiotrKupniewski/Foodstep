package pl.kupniewski.application.usecases.order;


import pl.kupniewski.application.usecases.order.model.OrderDto;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Override
    public OrderDto createNewOrder(Long customerId, Long restaurantId, List<Long> items) {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
}
