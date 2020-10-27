package pl.kupniewski.application.dao;

import pl.kupniewski.application.model.UserDto;

public interface UserDao {

    UserDto findUserById(Long id);
}
