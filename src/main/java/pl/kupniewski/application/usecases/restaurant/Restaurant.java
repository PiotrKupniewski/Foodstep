package pl.kupniewski.application.usecases.restaurant;

import pl.kupniewski.application.usecases.order.model.PreparedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

public interface Restaurant {

    Order assignOrder(Order order);

    PreparedOrder realizeOrder(Order order);
}
