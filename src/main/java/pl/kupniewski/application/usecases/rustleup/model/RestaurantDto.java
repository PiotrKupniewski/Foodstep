package pl.kupniewski.application.usecases.rustleup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantAddressDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {

    private Long id;
    private String name;
    private RestaurantAddressDto adress;
    private MenuDto menu;

}
