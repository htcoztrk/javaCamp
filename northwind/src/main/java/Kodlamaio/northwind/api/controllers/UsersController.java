package Kodlamaio.northwind.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.northwind.business.abstracts.UserService;
import Kodlamaio.northwind.core.entities.User;


@RestController
@RequestMapping(value="/api/users")
public class UsersController {

	private UserService userService;

	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping(value="/add")
	public ResponseEntity<?> add(@RequestBody User user) {
		return ResponseEntity.ok(userService.add(user));
	}
}
