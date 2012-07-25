/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.services;

import java.util.List;

import com.efile.model.UploadData;

public interface FileService {

	public List<UploadData> getAllUploadFiles(String userId)throws Exception;
	public void insertUploadDetails(UploadData uploadData) throws Exception;
}
