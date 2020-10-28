package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.rustleup.Menu;
import pl.kupniewski.application.authenticate.UserDto;

import java.util.Optional;

@AllArgsConstructor
public class CreateOrderByUser {

    private final UserDao userDao;
    private final Order orderService;

    public Order createNewOrderForUser(Long userId, Menu menu) {

        UserDto user = Optional.of(userDao.findUserById(userId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        //transfer status from restaurant to deliverer

        return null;
    }
}
