package pl.kupniewski.application.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.restaurant.menu.Menu;
import pl.kupniewski.application.restaurant.menu.MenuCreator;
import pl.kupniewski.application.restaurant.menu.MenuItem;
import pl.kupniewski.application.order.Order;
import pl.kupniewski.application.storages.OrderStorage;

import java.util.*;

@AllArgsConstructor
@Component
public class RestaurantApi {

    private final MenuCreator menuCreator;
    private final CompleteOrderByRestaurant completedOrder;
    private RestaurantStorage ordersStorage;

    public Menu createMenu(){
        List<MenuItem> items = new ArrayList<>();
        return menuCreator.createNewMenu(items);
    }

    public OrderReadyToDeliver assignOrderToDeliverer(Order order) {
        ordersStorage.removeOrderFromStorage(order);
        return completedOrder.assignOrderToDeliverer(order);
    }

    public OrderStorage createOrdersStorage(){
        if(ordersStorage != null && ordersStorage.getActiveOrders().size()==0) {
            this.ordersStorage = new OrderStorage(new HashMap<>());
        }
        return new OrderStorage(ordersStorage.getActiveOrders());
    }

    public Map<UUID, Order> getActiveOrders(){
        return ordersStorage.getActiveOrders();
    }


}
