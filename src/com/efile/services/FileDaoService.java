/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.services;

import java.util.List;
import com.efile.db.UploadDAO;
import com.efile.db.UploadDAOImpl;
import com.efile.model.UploadData;

/**
 * Class is responsible for accessing the service of file DAO.
 */
public class FileDaoService implements FileService{

	UploadDAO uploadDAO;
	public FileDaoService(){
		uploadDAO = new UploadDAOImpl();
	}
	
	@Override
	public List<UploadData> getAllUploadFiles(String userId)throws Exception {
		return uploadDAO.getAllUpload(userId);
	}

	@Override
	public void insertUploadDetails(UploadData uploadData) throws Exception{
		uploadDAO.insertUpload(uploadData);
	}

}
