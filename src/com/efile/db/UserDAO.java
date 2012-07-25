/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.util.List;
import com.efile.model.User;

/**
 * Interface of userdao.
 */
public interface UserDAO {
	public List<User> getAllUser() throws Exception;
	public User getUser(Integer id) throws Exception;
	public void update(User user) throws Exception;
	public void insert(User user) throws Exception;
	public void delete(Integer id) throws Exception;
	public User isValidUser(String pan, String password) throws Exception;
}
