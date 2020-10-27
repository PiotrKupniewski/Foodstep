package pl.kupniewski.application.domain.Order;

import lombok.AllArgsConstructor;
import pl.kupniewski.application.domain.Customer.Customer;
import pl.kupniewski.application.model.Menu;
import pl.kupniewski.application.model.Restaurant;
import pl.kupniewski.application.model.RestaurantAddress;

import java.sql.ResultSet;

@AllArgsConstructor
public class Order {


    private Menu menu;
    private Customer customer;
    private Restaurant restaurant;


}
