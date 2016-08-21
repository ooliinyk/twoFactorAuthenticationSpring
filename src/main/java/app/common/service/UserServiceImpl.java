package app.common.service;

import app.common.dao.UserDao;
import app.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;


    @Override
    public void save(User user) {
            dao.save(user);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public User findById(long id) {
        return dao.findById(id);
    }

    @Override
    public User findByLogin(String login) {
        return dao.findByLogin(login);
    }
}
