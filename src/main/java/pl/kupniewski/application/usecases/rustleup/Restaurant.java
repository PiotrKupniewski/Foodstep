package pl.kupniewski.application.usecases.rustleup;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Restaurant {

    private Long id;
    private String name;
    private RestaurantAddress adress;
    private Menu menu;


}
