package com.nwchecker.server.repositories.jpa;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.nwchecker.server.model.User;
import com.nwchecker.server.repositories.UserRepository;

@Repository
public class JpaUserRepositoryImpl implements UserRepository {

	@PersistenceContext
	private EntityManager	em;

	@Override
	public void addUser(User user) {
		this.em.persist(user);
	}

	@Override
	public void updateUser(User user) {
		this.em.merge(user);
	}

	@Override
	public void deleteUser(User user) {
		this.em.remove(user);
	}

	@Override
	public User getUserById(int id) {
		Query query = this.em.createQuery("SELECT user FROM User user WHERE user.id =:id");
		query.setParameter("id", id);
		return (User) query.getSingleResult();
	}

	@Override
	public User getUserByUsername(String username) {
		Query query = this.em.createQuery("SELECT user FROM User user WHERE user.username =:username");
		query.setParameter("username", username);
		return (User) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<User> getUsers() {
		Query query = this.em.createQuery("SELECT user FROM User user");
		return query.getResultList();
	}
}
