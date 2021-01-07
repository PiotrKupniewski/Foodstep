package pl.kupniewski.application.authenticate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private final String userLogin;
    private final UserRole role;

}
