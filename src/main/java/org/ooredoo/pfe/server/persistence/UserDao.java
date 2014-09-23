package org.ooredoo.pfe.server.persistence;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@PersistenceContext(unitName = "dashboardX")
    EntityManager entityManager;
	
	// Login = id
	public UserEntity findById(String login) {
        return entityManager.find(UserEntity.class, login);
    }

}
