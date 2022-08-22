package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    void editUser(User user);
}
