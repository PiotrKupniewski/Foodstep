package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

    private final Long orderId;
    private final Status status;

    public enum Status {
        IN_PROGRESS
    }
}
