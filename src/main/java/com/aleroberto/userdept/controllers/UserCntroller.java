package com.aleroberto.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleroberto.userdept.entities.User;
import com.aleroberto.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserCntroller {

	@Autowired
	private UserRepository repository;

	@GetMapping
	private List<User> listAlll() {
		return repository.findAll();

	}

	@GetMapping(value = "/{id}")
	private User userGetById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	private void add(User user) {
		repository.save(user);
	}

}
