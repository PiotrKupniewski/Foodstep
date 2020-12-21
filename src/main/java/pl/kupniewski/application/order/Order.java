package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Order {

    private final UUID orderId = UUID.randomUUID();
    private final Status status;

    public enum Status {
        IN_PROGRESS
    }
}
