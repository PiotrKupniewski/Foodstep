package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {

    private Long id;
    private String name;
    private RestaurantAddressDto adress;
    private MenuDto menu;

}
