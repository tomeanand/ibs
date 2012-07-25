/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.efile.common.Constants;
import com.efile.model.UploadData;

public class UploadDAOImpl implements UploadDAO {

	private Connection connection;

	public UploadDAOImpl() {
		try {
			DAOFactory dbFactory = DAOFactory.getDAOFactory(Constants.MYSQL_DAO_FACTORY);
			connection = dbFactory.createConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<UploadData> getAllUpload(String userId) throws Exception {
		List<UploadData> uploadDataList = new ArrayList<UploadData>();
		String sql = "SELECT * FROM file_info where userId =  ?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, userId);
		ResultSet resultSet = pStatement.executeQuery();
		UploadData uploadData = null;
		while (resultSet.next()) {
			uploadData = new UploadData();
			uploadData.setFileName(resultSet.getString("fileName"));
			uploadData.setYear(resultSet.getString("year"));
			uploadData.setFileContentType(resultSet
					.getString("fileContentType"));
			uploadData.setFilePath(resultSet.getString("filePath"));
			uploadDataList.add(uploadData);
		}
		return uploadDataList;
	}

	@Override
	public void insertUpload(UploadData uploadData) throws Exception {
		try {
			String sql = "INSERT INTO file_info(userId,year,fileName,filePath,fileContentType,lastUpdatedTmstmp)VALUES(?,?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sql);
			pStatement.setString(1, uploadData.getPanNo());
			pStatement.setString(2, uploadData.getYear());
			pStatement.setString(3, uploadData.getFileName());
			pStatement.setString(4, uploadData.getFilePath());
			pStatement.setString(5, uploadData.getFileContentType());
			pStatement.setDate(6, new Date(System.currentTimeMillis()));

			pStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println("exception occurred in saving the file upload information -"+ e.getMessage());
			throw new Exception(e.getMessage());
		}

	}

}
