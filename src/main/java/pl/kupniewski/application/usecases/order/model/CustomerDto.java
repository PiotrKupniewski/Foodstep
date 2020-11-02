package pl.kupniewski.application.usecases.order.model;


import pl.kupniewski.application.authenticate.UserDto;

public class CustomerDto extends UserDto {

    public CustomerDto(Long userId, String firstName, String lastName, String email, String phoneNumber) {
        super(userId, firstName, lastName, email, phoneNumber);
    }
}
