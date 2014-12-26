package com.nwchecker.server.repositories;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import com.nwchecker.server.model.User;

public interface UserRepository {

	void addUser(User user)  throws DataAccessException;

	void updateUser(User user)  throws DataAccessException;

	void deleteUser(User user)  throws DataAccessException;

	User getUserById(int id)  throws DataAccessException;

	User getUserByUsername(String username)  throws DataAccessException;

	Collection<User> getUsers()  throws DataAccessException;
	
}
