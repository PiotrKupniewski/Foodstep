package pl.kupniewski.application.authenticate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthenticateUser {

    private final User user;

    public String getAuthenticatedViewName(){
        User authenticatedUser = authenticate();
        return authenticatedUser.getRole() == UserRole.CUTOMER ? "customer" : "restaurant";
    }

    private User authenticate(){
        return user;
    }
}
