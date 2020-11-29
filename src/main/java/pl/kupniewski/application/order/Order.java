package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

    private final Long orderId;
    private final OrderStatus orderStatus;

    public enum OrderStatus {
        IN_PROGRESS
    }
}
