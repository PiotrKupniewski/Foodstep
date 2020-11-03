package pl.kupniewski.application.usecases.order;

import pl.kupniewski.application.usecases.order.model.OrderDto;

import java.util.List;

public interface OrderDao {
    OrderDto createNewOrder(Long customerId, Long restaurantId, List<Long> items);
}
