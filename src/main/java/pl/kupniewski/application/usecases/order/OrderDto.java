package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.rustleup.MenuDto;
import pl.kupniewski.application.usecases.rustleup.RestaurantDto;

@AllArgsConstructor
public class OrderDto {


    private MenuDto menu;
    private CustomerDto customer;
    private RestaurantDto restaurant;


}
