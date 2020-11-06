package pl.kupniewski.application.usecases.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long orderId;
    private OrderStatus orderStatus;
    public enum OrderStatus {
        IN_PROGRESS, DELIVERING, REALIZED, RESTAURANT_PREPARING
    }

}
