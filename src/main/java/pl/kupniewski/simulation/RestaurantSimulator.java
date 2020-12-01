package pl.kupniewski.simulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.order.Order;

import java.util.List;


@AllArgsConstructor
@Getter
@Component
public class RestaurantSimulator {
    private final List<Order> ordersList;

}
