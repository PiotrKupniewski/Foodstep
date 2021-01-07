package pl.kupniewski.simulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;

import java.util.List;

@Getter
@AllArgsConstructor
@Component
public class DelivererSimulator {
    List<OrderReadyToDeliver> ordersToDeliver;
}
