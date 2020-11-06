package pl.kupniewski.presenter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kupniewski.application.usecases.order.CreateOrderByCustomer;
import pl.kupniewski.application.usecases.order.model.PreparedOrder;


@Controller
public class OrderController {

    private CreateOrderByCustomer createOrderByCustomer;

    @GetMapping("/customer")
    public String greeting() {
        return "customer.html";
    }

    @GetMapping("/customer/order")
    public ResponseEntity<PreparedOrder> orderFood() {
        PreparedOrder newOrderForCustomer = createOrderByCustomer.createNewOrderForCustomer();
        return new ResponseEntity<PreparedOrder>(newOrderForCustomer, HttpStatus.OK);
    }

}
