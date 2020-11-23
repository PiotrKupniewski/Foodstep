package pl.kupniewski.presenter;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kupniewski.application.usecases.authenticate.AuthenticateUser;
import pl.kupniewski.application.usecases.authenticate.User;
import pl.kupniewski.application.usecases.authenticate.UserRole;

@Controller
@AllArgsConstructor
public class LoginPresenter {

    @GetMapping("/")
    public String loginUser(){
        AuthenticateUser authenticateUser = new AuthenticateUser(new User("customer", UserRole.CUTOMER));
        return "redirect:"+authenticateUser.getAuthenticatedViewName();
    }
}
