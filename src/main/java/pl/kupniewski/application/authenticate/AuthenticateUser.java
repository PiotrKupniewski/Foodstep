package pl.kupniewski.application.authenticate;

public class AuthenticateUser {

    User customerUser = new User("customer", UserRole.CUTOMER);

    private User authenticate(){
        return customerUser;
    }

    public String getAuthenticatedViewName(){
        User authenticatedUser = authenticate();
        return authenticatedUser.getRole() == UserRole.CUTOMER ? "customer" : "restaurant";
    }
}
