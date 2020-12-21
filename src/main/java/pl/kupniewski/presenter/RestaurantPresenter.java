package pl.kupniewski.presenter;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kupniewski.application.order.OrderStorage;
import pl.kupniewski.application.deliver.api.RestaurantApi;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.menu.Menu;
import pl.kupniewski.application.order.Order;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantPresenter {

    RestaurantApi restaurant;

    @GetMapping("")
    public String restaurantView() {
        return "restaurant";
    }

    @PostMapping("/completeOrder")
    public OrderReadyToDeliver completeOrderByRestaurant(@RequestBody Order order) {
        return restaurant.assignOrderToDeliverer(order);
    }
    @GetMapping("/createOrderStorage")
    public OrderStorage createOrdersStorage() {
        return restaurant.createOrdersStorage();
    }

    @GetMapping("/getActiveOrders")
    public ResponseEntity<List<Order>> getActiveOrders() {
        return new ResponseEntity<>(new ArrayList<>(restaurant.getActiveOrders()
                .values()), HttpStatus.OK);
    }

    @GetMapping("/createMenu")
    public Menu createNewRestaurantMenu() {
        return restaurant.createMenu();
    }

}
