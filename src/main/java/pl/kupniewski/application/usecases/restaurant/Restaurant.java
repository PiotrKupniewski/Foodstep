package pl.kupniewski.application.usecases.restaurant;

import pl.kupniewski.application.usecases.order.model.CompletedOrder;
import pl.kupniewski.application.usecases.order.model.Order;

public interface Restaurant {
    CompletedOrder completeTheOrder(Order order);
}
