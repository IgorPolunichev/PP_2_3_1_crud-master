package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


    private List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User("Petr","Smirnov",23));
        userList.add(new User("Ivan","Petrov",32));
        userList.add(new User("Maksim","Sidorov",25));
        userList.add(new User("Ilya","Krilov",30));
    }

    @Override
    public List<User> index() {
        return userList;
    }

    public User show(int id) {
//        return userList.get(id);
        return null;
    }

    @Override
    public void add(User user) {
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User create(User user) {
        return null;
    }
}
