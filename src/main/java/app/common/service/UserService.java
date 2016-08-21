package app.common.service;

import app.common.entity.User;

import java.util.List;

/**
 * Created by user on 19.08.2016.
 */
public interface UserService {

    void save(User user);

    List<User> findAll();

    User findById(long id);

    User findByLogin(String login);

}
