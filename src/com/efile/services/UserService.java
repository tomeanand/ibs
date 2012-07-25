/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.services;

import java.util.List;

import com.efile.model.User;

public interface UserService {

	public User isValidUser(String pan, String password) throws Exception;
	public void insertUser(User user) throws Exception;
	public List<User> getAllUser() throws Exception;
}
