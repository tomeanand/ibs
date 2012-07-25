/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.sql.Connection;
import java.sql.DriverManager;

import com.efile.common.Constants;

public class MysqlDAOFactory extends DAOFactory {

	private static final String dbUrl = "jdbc:mysql://localhost:3306/" + Constants.DATABASE_NAME;
	private static final String dbClass = "com.mysql.jdbc.Driver";
	private static final String userName = "root";
	private static final String password = Constants.EMPTY_STRING;

	/**
	 * Method is used to return the mysql connection
	 */
	public Connection createConnection() throws Exception {
		Class.forName(dbClass);
		return DriverManager.getConnection(dbUrl, userName, password);
	}

}
