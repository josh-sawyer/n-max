package com.nmax.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nmax.model.UserInfo;
import com.nmax.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserInfo loadUserByUsername(String username) throws UsernameNotFoundException {
		UserInfo user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return user;
	}
	
	public List<UserInfo> fetchUsers() {
		return userRepository.findAll();
	}

	public UserInfo newUser() {
		UserInfo user = new UserInfo();
		user.setUsername("user");
		user.setPassword(encoder.encode("pass"));
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setFirstName("FirstName:" + UUID.randomUUID().toString());
		user.setLastName("LastName:" + UUID.randomUUID().toString());
		return userRepository.save(user);
	}

}
