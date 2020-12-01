package pl.kupniewski.application.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Menu {
    private final Long id;
    private final List<MenuItem> items;
}
