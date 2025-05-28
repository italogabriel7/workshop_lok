package com.dsbebida.lokcourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsbebida.lokcourse.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L, "Anderson", "anderson@gmail.com", "7777777", "12345");
		return ResponseEntity.ok().body(u);
		}
}
