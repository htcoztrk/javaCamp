package business.abstracts;

import entities.concretes.User;

public interface UserService {
   void add(User user);
   boolean isLogin(String email, String password);
}
