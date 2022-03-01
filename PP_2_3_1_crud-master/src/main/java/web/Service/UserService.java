package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserService implements UserServ {
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.add(user);

    }

    @Override
    public List<User> listUser() {
        return null;
    }

    @Transactional
    @Override
    public void editUser(User user) {

    }

    @Transactional
    @Override
    public void removeUser(int id) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
