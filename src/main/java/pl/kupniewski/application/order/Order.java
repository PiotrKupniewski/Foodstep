package pl.kupniewski.application.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private final UUID orderId = UUID.randomUUID();
    private Status status;

    public enum Status {
        IN_PROGRESS, FINISHED
    }
}
