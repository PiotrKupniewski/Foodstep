package pl.kupniewski.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kupniewski.application.deliver.OrderReadyToDeliver;
import pl.kupniewski.simulation.DelivererApi;

@Controller
@RequestMapping("/deliverer")
public class DelivererPresenter {

    DelivererApi delivererApi;

    @GetMapping
    public OrderReadyToDeliver deliverOrderToCustomer(@RequestBody OrderReadyToDeliver orderReadyToDeliver){
        return delivererApi.deliverOrderToCustomer(orderReadyToDeliver);
    }
}
