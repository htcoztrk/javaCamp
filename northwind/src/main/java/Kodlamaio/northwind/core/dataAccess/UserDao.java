package Kodlamaio.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer> {
   User findByEmail(String email);
}
