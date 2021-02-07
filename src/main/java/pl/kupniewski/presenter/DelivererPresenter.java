package pl.kupniewski.presenter;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.application.deliver.DelivererApi;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/deliverer")
public class DelivererPresenter {

    DelivererApi delivererApi;

    @GetMapping("")
    public String restaurantView() {
        return "deliverer";
    }

    @PostMapping("/deliverOrder")
    public ResponseEntity<List<OrderReadyToDeliver>> deliverOrderToCustomer(
            @RequestBody List<OrderReadyToDeliver> orders
    ) {
        return new ResponseEntity<>(delivererApi.deliverOrderToCustomer(orders), HttpStatus.OK);
    }

    @PostMapping("/getActiveOrders")
    public ResponseEntity<List<OrderReadyToDeliver>> getActiveDelivererOrders() {
        return new ResponseEntity<>(delivererApi.getActiverdersList(), HttpStatus.OK);
    }
}
