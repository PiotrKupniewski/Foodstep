package pl.kupniewski.application.usecases.Customer;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.dao.UserDao;
import pl.kupniewski.application.domain.Order.Order;
import pl.kupniewski.application.model.Menu;
import pl.kupniewski.application.model.UserDto;

import java.util.Optional;

@AllArgsConstructor
public class OrderFood {


    private final UserDao userDao;
    private final Order orderService;



    public Order createNewOrderForUser(Long userId, Menu menu){

        UserDto user = Optional.of(userDao.findUserById(userId))
                .orElseThrow(() -> new UnsupportedOperationException("Cannot find user"));

        //transfer status from restaurant to deliverer

        return new Order(menu, customer, restauran);
    }


}
