package pl.kupniewski.presenter;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.deliver.api.DelivererApi;

import java.util.Map;
import java.util.UUID;

@Controller
@AllArgsConstructor
@RequestMapping("/deliverer")
public class DelivererPresenter {

    DelivererApi delivererApi;

    @GetMapping("")
    public String restaurantView() {
        return "deliverer";
    }

    @GetMapping("/deliverOrder")
    public ResponseEntity<OrderReadyToDeliver> deliverOrderToCustomer(@RequestBody OrderReadyToDeliver orderReadyToDeliver) {
        return new ResponseEntity<>(delivererApi.deliverOrderToCustomer(orderReadyToDeliver), HttpStatus.OK);
    }

    @GetMapping("/getActiveOrders")
    public ResponseEntity<Map<UUID, OrderReadyToDeliver>> getActiveDelivererOrders() {
        return new ResponseEntity<>(delivererApi.getActiverders(), HttpStatus.OK);
    }
}
