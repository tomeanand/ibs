/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.services;

import java.util.List;
import com.efile.db.UserDAO;
import com.efile.db.UserDAOImpl;
import com.efile.model.User;

/**
 * Class is responsible for accessing the service of user DAO.
 */
public class UserDaoService implements UserService {

	private UserDAO userDAO;

	public UserDaoService() {
		this.userDAO = new UserDAOImpl();
	}

	@Override
	public User isValidUser(String pan, String password) throws Exception {
		System.out.println("psss-"+ pan +"pppp"+ password);
		return this.userDAO.isValidUser(pan, password);
	}

	@Override
	public void insertUser(User user) throws Exception {
		this.userDAO.insert(user);
	}

	@Override
	public List<User> getAllUser() throws Exception {
		return this.userDAO.getAllUser();
	}

}
