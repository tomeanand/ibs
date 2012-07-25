/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.sql.Connection;
import com.efile.common.Constants;


public abstract class DAOFactory {

	public abstract Connection createConnection() throws Exception;
	/**
	 * Method is used to return the DAO Factory based on the Database
	 * @param whichFactory
	 * @return
	 */
	public static DAOFactory getDAOFactory(int whichFactory) {
		if (Constants.MYSQL_DAO_FACTORY == whichFactory) {
			return new MysqlDAOFactory();
		}
		return null;
	}

}
