package pl.kupniewski.presenter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.kupniewski.application.order.CreateOrderByCustomer;
import pl.kupniewski.application.order.CustomerApi;
import pl.kupniewski.application.order.Order;


@Controller
@RequestMapping("/customer")
public class OrderPresenter {

    private final CustomerApi customerApi;

    public OrderPresenter(CustomerApi customerApi) {
        this.customerApi = customerApi;
    }

    @GetMapping("")
    public String customerView() {
        return "customer";
    }

    @GetMapping("/order")
    public ResponseEntity<Order> orderFood() {
        return new ResponseEntity<>(customerApi.createNewOrderForCustomer(), HttpStatus.OK);
    }

}
