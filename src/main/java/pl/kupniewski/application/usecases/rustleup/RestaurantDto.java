package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RestaurantDto {

    private Long id;
    private String name;
    private RestaurantAddressDto adress;
    private MenuDto menu;


}
