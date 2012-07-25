/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.db;

import java.util.List;
import com.efile.model.UploadData;

/**
 * Interface is responsible for file upload information.
 */
public interface UploadDAO {

	public List<UploadData> getAllUpload(String userId) throws Exception;
	public void insertUpload(UploadData uploadData) throws Exception;
}
