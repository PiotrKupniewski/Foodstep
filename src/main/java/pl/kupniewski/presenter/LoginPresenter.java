package pl.kupniewski.presenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kupniewski.application.authenticate.AuthenticateUser;

@Controller
public class LoginPresenter {

    AuthenticateUser authenticateUser;

    @GetMapping("/")
    public String loginUser(){
        return authenticateUser.getAuthenticatedViewName();
    }
}
