package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.rustleup.MenuDto;
import pl.kupniewski.application.authenticate.UserDto;

import java.util.Optional;

@AllArgsConstructor
public class CreateOrderByCustomer {

    private final UserDao userDao;
    private final OrderDto orderService;

    public OrderDto createNewOrderForUser(Long userId, MenuDto menu) {

        UserDto user = Optional.of(userDao.findUserById(userId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        //transfer status from restaurant to deliverer

        return null;
    }
}
