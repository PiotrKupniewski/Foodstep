package pl.kupniewski.application.deliver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.kupniewski.application.order.Order;

@Getter
@AllArgsConstructor
public class OrderReadyToDeliver {
    private final String status;
    private final Order order;
}
