package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
    void add(User user);
    User getByEmail(String email);
    User getById(int id);
    List<User> getAll();
    boolean isLogin(String email,String password);
}
