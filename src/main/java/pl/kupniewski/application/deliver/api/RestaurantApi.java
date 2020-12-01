package pl.kupniewski.application.deliver.api;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.CompleteOrderByRestaurant;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.menu.Menu;
import pl.kupniewski.application.menu.MenuCreator;
import pl.kupniewski.application.menu.MenuItem;
import pl.kupniewski.application.order.Order;
import pl.kupniewski.simulation.RestaurantSimulator;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class RestaurantApi {

    private final RestaurantSimulator restaurantSimulator;
    private final MenuCreator menuCreator;
    private final CompleteOrderByRestaurant completeOrder;

    public void addOrderToRestaurantList(Order order) {
        restaurantSimulator.getOrdersList().add(order);
    }

    public List<Order> getActiveOrders() {
        return restaurantSimulator.getOrdersList();
    }

    public Menu createMenu(){
        List<MenuItem> items = new ArrayList<>();
        return menuCreator.createNewMenu(items);
    }

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        return completeOrder.assignOrderToDeliverer(order);
    }

}
