package pl.kupniewski.application.deliver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.kupniewski.application.order.Order;

@Getter
@AllArgsConstructor
public class OrderReadyToDeliver {
    private final Order.Status status;
    private final Order order;

    @Override
    public String toString() {
        return "OrderReadyToDeliver{" +
                "status=" + status +
                ", order=" + order +
                '}';
    }
}
