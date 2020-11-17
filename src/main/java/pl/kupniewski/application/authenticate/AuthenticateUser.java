package pl.kupniewski.application.authenticate;

public class AuthenticateUser {

    private UserRepository userRepository;

    User customerUser = new User("customer", UserRole.CUTOMER);

    private User authenticate(String userLogin){
        var user = userRepository.findByUserLogin(userLogin).orElseThrow(() -> new UnsupportedOperationException("User not found!"));
        return customerUser;
    }

    public String getAuthenticatedViewName(){
        User authenticatedUser = authenticate("restaurant");
        return authenticatedUser.getRole() == UserRole.CUTOMER ? "customer" : "restaurant";
    }
}
