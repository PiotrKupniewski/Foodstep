package pl.kupniewski.application.simulation;

import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.usecases.order.Order;

public interface Restaurant {
    OrderReadyToDeliver completeTheOrder(Order order);
}
