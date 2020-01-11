package com.nmax.service;

import com.nmax.model.UserInfo;
import com.nmax.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
	
	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserInfo loadUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public List<UserInfo> fetchUsers() {
		return userRepository.findAll();
	}

	public UserInfo newUser() {
		UserInfo user = new UserInfo();
		user.setUsername("user");
		user.setFirstName("FirstName:" + UUID.randomUUID().toString());
		user.setLastName("LastName:" + UUID.randomUUID().toString());
		return userRepository.save(user);
	}

}
