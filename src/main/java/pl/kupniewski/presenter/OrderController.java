package pl.kupniewski.presenter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kupniewski.application.usecases.order.CreateOrderByCustomer;
import pl.kupniewski.application.usecases.deliver.OrderReadyToDeliver;


@Controller
public class OrderController {

    private final CreateOrderByCustomer createOrderByCustomer;

    public OrderController(CreateOrderByCustomer createOrderByCustomer) {
        this.createOrderByCustomer = createOrderByCustomer;
    }

    @GetMapping("/customer")
    public String customerView() {
        return "customer";
    }

    @GetMapping("/customer/order")
    public ResponseEntity<OrderReadyToDeliver> orderFood() {
        OrderReadyToDeliver newOrderForCustomer = createOrderByCustomer.createNewOrderForCustomer();
        return new ResponseEntity<>(newOrderForCustomer, HttpStatus.OK);
    }

}
