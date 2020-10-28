package pl.kupniewski.application.authenticate;

public interface UserDao {

    UserDto findUserById(Long id);
}
