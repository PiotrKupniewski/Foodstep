package pl.kupniewski.simulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
import pl.kupniewski.application.deliver.api.RestaurantApi;
import java.util.UUID;


@AllArgsConstructor
@Getter
@Component
public class RestaurantSimulator {

    private final RestaurantApi restaurantApi;
    private final UUID uuid = UUID.randomUUID();

}
