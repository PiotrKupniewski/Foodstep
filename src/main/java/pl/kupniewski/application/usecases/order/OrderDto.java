package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

@AllArgsConstructor
public class OrderDto {

    private MenuDto menu;
    private CustomerDto customer;
    private RestaurantDto restaurant;

}
