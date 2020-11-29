package pl.kupniewski.application.usecases.deliver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.kupniewski.application.usecases.order.Order;

@Getter
@AllArgsConstructor
public class OrderReadyToDeliver {
    private final String status;
    private final Order order;
}
