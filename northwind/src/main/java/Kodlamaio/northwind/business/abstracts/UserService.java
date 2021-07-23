package Kodlamaio.northwind.business.abstracts;

import Kodlamaio.northwind.core.entities.User;
import Kodlamaio.northwind.core.utilities.results.DataResult;
import Kodlamaio.northwind.core.utilities.results.Result;

public interface UserService {
   Result add(User user);
   DataResult<User> fndByEmail(String email);
}
