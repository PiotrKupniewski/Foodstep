package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.RestaurantDao;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

import java.util.Optional;

@AllArgsConstructor
public class CreateOrderByCustomer {

    private final UserDao userDao;
    private final RestaurantDao restaurantDao;

    public OrderDto createNewOrderForUser(Long customerId, Long restaurantId, List<Long> orderedPositions) {

        Long newId = null;

        CustomerDto customer = (CustomerDto) Optional.of(userDao.findUserById(customerId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        RestaurantDto restaurant = Optional.of(restaurantDao.findRestauranById(restaurantId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find restaurant"));

        MenuDto menu = Optional.of(restaurantDao.findPositionsById(orderedPositions))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find restaurant"));

        return new OrderDto(newId, menu, customer, restaurant);
    }
}
