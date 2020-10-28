package pl.kupniewski.application.authenticate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


}
