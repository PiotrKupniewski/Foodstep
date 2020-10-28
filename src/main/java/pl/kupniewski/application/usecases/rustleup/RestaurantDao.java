package pl.kupniewski.application.usecases.rustleup;

import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

public interface RestaurantDao {

     RestaurantDto findRestauranById(Long restaurantId);

}
