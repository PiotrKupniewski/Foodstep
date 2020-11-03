package pl.kupniewski.test.usecases.order;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.kupniewski.application.authenticate.UserDao;
import pl.kupniewski.application.usecases.order.CreateOrderByCustomer;
import pl.kupniewski.application.usecases.order.model.CustomerDto;
import pl.kupniewski.application.usecases.order.model.OrderDto;
import pl.kupniewski.application.usecases.rustleup.RestaurantDao;
import pl.kupniewski.application.usecases.rustleup.model.MenuDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantAddressDto;
import pl.kupniewski.application.usecases.rustleup.model.RestaurantDto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CreateOrderByCustomerTest {

    @Mock
    UserDao useDao;

    @Mock
    RestaurantDao restaurantDao;

    private RestaurantAddressDto restaurantAddress;

    private MenuDto menu;

    @Mock
    private CreateOrderByCustomer createOrderByCustomer;

    @BeforeAll
    void init() {
        restaurantAddress = new RestaurantAddressDto() {
        };
        menu = new MenuDto();
    }

    @Test
    void shouldCreateNewOrder() {
        List<Long> orderedPositions = List.of(5L, 10L);

        CustomerDto cust = new CustomerDto(1L, "Piotr", "Kupniewski", "pkupniewski.dev@gmail.com", "510485144");
        RestaurantDto r = new RestaurantDto(2L, "U piotrka", restaurantAddress, menu);

        Mockito.when(useDao.findUserById(1L)).thenReturn(cust);
        Mockito.when(restaurantDao.findRestauranById(2L)).thenReturn(new RestaurantDto(2L, "U piotrka", restaurantAddress, menu));
        Mockito.when(createOrderByCustomer.createNewOrderForUser(1L, 2L, orderedPositions)).thenReturn(new OrderDto(1L, menu, cust, r, OrderDto.OrderStatus.IN_PROGRESS));
        Long orderId = createOrderByCustomer.createNewOrderForUser(1L, 2L, orderedPositions).getOrderId();
        assertEquals(orderId, 1L);

    }

    @Test
    void shouldThrowNotFoundCustomerException() {
        List<Long> orderedPositions = List.of(5L, 10L);

        CustomerDto cust = new CustomerDto(1L, "Piotr", "Kupniewski", "pkupniewski.dev@gmail.com", "510485144");
        RestaurantDto r = new RestaurantDto(2L, "U piotrka", restaurantAddress, menu);

        Mockito.when(useDao.findUserById(1L)).thenThrow(new UnsupportedOperationException("Not found exception"));

    }

}