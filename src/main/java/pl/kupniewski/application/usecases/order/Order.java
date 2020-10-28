package pl.kupniewski.application.usecases.order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.usecases.rustleup.Menu;
import pl.kupniewski.application.usecases.rustleup.Restaurant;

@AllArgsConstructor
public class Order {


    private Menu menu;
    private Customer customer;
    private Restaurant restaurant;


}
