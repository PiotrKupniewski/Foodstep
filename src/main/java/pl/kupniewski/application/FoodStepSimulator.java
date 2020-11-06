package pl.kupniewski.application;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@AllArgsConstructor
@ComponentScan(basePackages = "pl.kupniewski")
public class FoodStepSimulator {

    public static void main(String[] args) {
        SpringApplication.run(FoodStepSimulator.class, args);

        //FoodStepSimulator appSimulator = new FoodStepSimulator(new CreateOrderByCustomer(), new DeliverOrderToCustomer(), new SimulatedRestaurant());
        /*Order order = appSimulator.customer.createNewOrderForCustomer();
        order = appSimulator.restaurant.assignOrder(order);
        CompletedOrder completedOrder = appSimulator.restaurant.realizeOrder(order);
        appSimulator.deliverer.deliverOrderToCustomer(completedOrder);*/
    }
}
