package pl.kupniewski.application.authenticate;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUserLogin(String userLogin);
}
