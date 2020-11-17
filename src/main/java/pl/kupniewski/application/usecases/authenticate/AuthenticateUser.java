package pl.kupniewski.application.usecases.authenticate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthenticateUser {

    private final User user;

    private User authenticate(){
        return user;
    }

    public String getAuthenticatedViewName(){
        User authenticatedUser = authenticate();
        return authenticatedUser.getRole() == UserRole.CUTOMER ? "customer" : "restaurant";
    }
}
