package org.example.dao;


import org.example.entity.User;
import java.util.List;

public interface UserDAO {

    public List<User> getAllUser();

    public void saveUser(User user);
}
