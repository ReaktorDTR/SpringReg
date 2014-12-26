package com.nwchecker.server.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.nwchecker.server.model.User;
import com.nwchecker.server.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void addUser(User user) throws DataAccessException {
		userRepository.addUser(user);
	}

	@Override
	public void updateUser(User user) throws DataAccessException {
		userRepository.updateUser(user);
	}

	@Override
	public void deleteUser(User user) throws DataAccessException {
		userRepository.deleteUser(user);
	}

	@Override
	public User getUserById(int id) throws DataAccessException {
		return userRepository.getUserById(id);
	}

	@Override
	public User getUserByUsername(String username) throws DataAccessException {
		return userRepository.getUserByUsername(username);
	}

	@Override
	public Collection<User> getUsers() throws DataAccessException {
		return userRepository.getUsers();
	}

}
