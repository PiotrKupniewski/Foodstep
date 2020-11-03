package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.order.model.CustomerDto;
import pl.kupniewski.application.usecases.order.model.OrderDto;
import pl.kupniewski.application.usecases.rustleup.ProcessCustomerOrder;
import pl.kupniewski.application.usecases.rustleup.RestaurantDao;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class CreateOrderByCustomer {

    private final UserDao userDao;
    private final RestaurantDao restaurantDao;
    private final ProcessCustomerOrder processCustomerOrder;

    public OrderDto createNewOrderForUser(Long customerId, Long restaurantId, List<Long> items) {

        Long newId = null;

        CustomerDto customer = (CustomerDto) Optional.of(userDao.findUserById(customerId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        RestaurantDto restaurant = Optional.of(restaurantDao.findRestauranById(restaurantId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find restaurant"));

        processCustomerOrder.assignCustomerOrderToRestaurant();


        MenuDto menu = Optional.of(restaurantDao.findPositionsById(items))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find restaurant"));

        return new OrderDto(newId, menu, customer, restaurant);
    }
}
