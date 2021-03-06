package pl.kupniewski.presenter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kupniewski.application.authenticate.AuthenticateUser;
import pl.kupniewski.application.authenticate.User;
import pl.kupniewski.application.authenticate.UserRole;

@Controller
@AllArgsConstructor
public class LoginPresenter {

    @GetMapping("/customerLogin")
    public String loginCustomerUser(){
        AuthenticateUser authenticateUser = new AuthenticateUser(new User("customer", UserRole.CUTOMER));
        return "redirect:"+authenticateUser.getAuthenticatedViewName();
    }

    @GetMapping("/restaurantLogin")
    public String loginRestaurantUser(){
        AuthenticateUser authenticateUser = new AuthenticateUser(new User("restaurant", UserRole.RESTAURANT));
        return "redirect:"+authenticateUser.getAuthenticatedViewName();
    }
}
