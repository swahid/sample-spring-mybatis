/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;

import org.javabase.apps.entity.User;
import org.javabase.apps.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author  Saurav Wahid<swahidfx@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper usermapper;
	
	@Override
	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		return usermapper.getAllUsers();
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserById(int userId) {
		return usermapper.getUserById(userId);
	}

	@Override
	@Transactional
	public void addUser(User user) {
		 usermapper.addUser(user);
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		usermapper.updateUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		usermapper.deleteUser(userId);
	}

	@Override
	@Transactional(readOnly=true)
	public boolean userExists(String username) {
		return usermapper.userExists(username);
	}

	@Override
	@Transactional(readOnly=true)
	public User getUserByUsername(String username) {
		return usermapper.getUserByUsername(username);
	}

}
