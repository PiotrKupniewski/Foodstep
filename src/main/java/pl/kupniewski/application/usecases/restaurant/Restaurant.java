package pl.kupniewski.application.usecases.restaurant;

import pl.kupniewski.application.usecases.deliver.Deliverer;
import pl.kupniewski.application.usecases.order.PreparedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

public interface Restaurant {

    Order assignOrder(Order order);

    PreparedOrder realizeOrder(Order order);
}
