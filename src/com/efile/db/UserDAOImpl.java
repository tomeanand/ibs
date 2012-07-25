/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.efile.common.Constants;
import com.efile.model.User;

/**
 * Class is responsible for loading/saving the user data
 */
public class UserDAOImpl implements UserDAO {

	private Connection connection = null;

	public UserDAOImpl() {
		try {
			DAOFactory dbFactory = DAOFactory.getDAOFactory(Constants.MYSQL_DAO_FACTORY);
			connection = dbFactory.createConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAllUser() throws Exception {
		List<User> userList = new ArrayList<User>();
		String sql = "SELECT * FROM user_info";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		ResultSet resultSet = pStatement.executeQuery();
		User user = null;
		while (resultSet.next()) {
			user = new User();
			user.setUid(resultSet.getString("uid"));
			user.setUserName(resultSet.getString("userName"));
			user.setPassword(resultSet.getString("password"));
			user.setFirstName(resultSet.getString("firstName"));
			user.setMiddleName(resultSet.getString("middleName"));
			user.setLastName(resultSet.getString("lastName"));
			user.setFathersName(resultSet.getString("fathersName"));
			user.setEmail(resultSet.getString("email"));
			user.setPhone(resultSet.getString("phone"));
			user.setAddress(resultSet.getString("address"));
			user.setPin(resultSet.getString("pin"));
			user.setResidenceStatus(resultSet.getString("residenceStatus"));
			user.setGender(resultSet.getString("gender"));
			user.setDob(resultSet.getDate("dob"));
			user.setPan(resultSet.getString("pan"));
			userList.add(user);
		}
		return userList;
	}

	@Override
	public User getUser(Integer id) {
		return null;
	}

	@Override
	public void update(User user) {

	}

	@Override
	public void insert(User user) throws Exception {
		try {
			String sql = "INSERT INTO user_info(uid,userName,password,firstName,middleName,lastName,fathersName,email,phone,address,pin,residenceStatus,gender,dob,pan) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, user.getUid());
			pStatement.setString(2, user.getUserName());
			pStatement.setString(3, user.getPassword());
			pStatement.setString(4, user.getFirstName());
			pStatement.setString(5, user.getMiddleName());

			pStatement.setString(6, user.getLastName());
			pStatement.setString(7, user.getFathersName());
			pStatement.setString(8, user.getEmail());
			pStatement.setString(9, user.getPhone());
			pStatement.setString(10, user.getAddress());

			pStatement.setString(11, user.getPin());
			pStatement.setString(12, user.getResidenceStatus());
			pStatement.setString(13, user.getGender());
			pStatement.setDate(14, user.getDob());
			pStatement.setString(15, user.getPan());

			pStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println("exception occurred in the user saving data - "
					+ e.getMessage());
			throw new Exception(e);
		}
	}

	@Override
	public User isValidUser(String pan, String password) throws Exception {
		DAOFactory dbFactory = DAOFactory
				.getDAOFactory(Constants.MYSQL_DAO_FACTORY);
		Connection connection = dbFactory.createConnection();
		String sql = "SELECT * FROM user_info where uid = ? and password = ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, pan);
		pStatement.setString(2, password);
		ResultSet resultSet = pStatement.executeQuery();
		User user = null;
		while (resultSet.next()) {
			user = new User();
			user.setUid(resultSet.getString("uid"));
			user.setUserName(resultSet.getString("userName"));
			user.setPassword(resultSet.getString("password"));
			user.setFirstName(resultSet.getString("firstName"));
			user.setMiddleName(resultSet.getString("middleName"));
			user.setLastName(resultSet.getString("lastName"));
			user.setFathersName(resultSet.getString("fathersName"));
			user.setEmail(resultSet.getString("email"));
			user.setPhone(resultSet.getString("phone"));
			user.setAddress(resultSet.getString("address"));
			user.setPin(resultSet.getString("pin"));
			user.setResidenceStatus(resultSet.getString("residenceStatus"));
			user.setGender(resultSet.getString("gender"));
			user.setDob(resultSet.getDate("dob"));
			user.setPan(resultSet.getString("pan"));

		}
		return user;
	}

	@Override
	public void delete(Integer id) {

	}

}
