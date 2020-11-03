package pl.kupniewski.application.usecases.order.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

@Data
@AllArgsConstructor
public class OrderDto {

    public enum OrderStatus{
        IN_PROGRESS,REALIZED;
    }

    private Long orderId;
    private MenuDto menu;
    private CustomerDto customer;
    private RestaurantDto restaurant;

}
