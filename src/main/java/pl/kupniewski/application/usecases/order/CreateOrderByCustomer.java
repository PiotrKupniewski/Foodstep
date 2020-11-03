package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.order.model.OrderDto;
import pl.kupniewski.application.usecases.rustleup.ProcessCustomerOrderToRestaurant;
import pl.kupniewski.application.usecases.rustleup.RestaurantDao;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CreateOrderByCustomer {

    private final UserDao userDao;
    private final RestaurantDao restaurantDao;
    private final ProcessCustomerOrderToRestaurant processCustomerOrder;
    private final OrderDao orderDao;

    public OrderDto createNewOrderForUser(Long customerId, Long restaurantId, List<Long> items) {
        validateParameters(customerId, restaurantId, items);
        return processCustomerOrder.assignOrder(orderDao.createNewOrder(customerId, restaurantId, items));
    }

    private void validateParameters(Long customerId, Long restaurantId, List<Long> items) {
        Optional.of(userDao.findUserById(customerId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        Optional.of(restaurantDao.findRestauranById(restaurantId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find restaurant"));

        Optional.of(restaurantDao.findItemsInRestaurantMenu(restaurantId, items))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find ordered items in restaurant menu"));
    }
}
