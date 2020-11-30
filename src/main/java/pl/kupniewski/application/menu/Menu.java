package pl.kupniewski.application.menu;

import lombok.Getter;

import java.util.List;

@Getter
public class Menu {

    private Long id;
    private List<MenuItem> items;
}
