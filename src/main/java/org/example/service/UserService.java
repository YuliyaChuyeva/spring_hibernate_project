package org.example.service;




import org.example.entity.User;
import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public void saveUser(User user);
}
