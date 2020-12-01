package pl.kupniewski.application.menu;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class MenuCreator {

    public Menu createNewMenu(List<MenuItem> menuItems){
        return new Menu(1L, menuItems);
    }

}
