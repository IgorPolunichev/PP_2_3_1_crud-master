package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    User create(User user);
    List<User> index ();
}