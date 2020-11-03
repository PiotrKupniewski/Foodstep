package pl.kupniewski.application.usecases.rustleup;

import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

import java.util.List;

public interface RestaurantDao {

    RestaurantDto findRestauranById(Long restaurantId);

    MenuDto findItemsInRestaurantMenu(Long restaurantId, List<Long> orderedPositions);
}
