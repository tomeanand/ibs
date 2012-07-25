/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.action;

import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.efile.common.Constants;
import com.efile.model.UploadData;
import com.efile.model.User;
import com.efile.services.FileDaoService;
import com.efile.services.FileService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is responsible for uploading the file and saving the file
 * information.
 */
public class MultipleFileUploadAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private List<File> uploadFile;
	private List<String> uploadFileFileName;
	private String year;
	HttpServletRequest request;
	private String saveDir;
	private static final String UPLOAD_MESSAGE = "file uploaded successfully..";

	public String getSaveDir() {
		return saveDir;
	}

	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public List<String> getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(List<String> uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public List<File> getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(List<File> uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String upload() throws Exception {
		try {
			User user = (User) (request.getSession()
					.getAttribute(Constants.USER_SESSION_ATTRIBUTE));
			UploadData uploadData = new UploadData();
			uploadData.setPanNo(user.getUid());
			uploadData.setYear(this.year);
			
			for (int i = 0; i < this.uploadFile.size(); i++) {
				File file = this.uploadFile.get(i);
				String fileName = this.uploadFileFileName.get(i);
				File fdir = new File(this.saveDir + File.separator + user.getUid() + File.separator + this.year);
				uploadData.setFilePath(fdir.getAbsolutePath());
				uploadData.setFileName(fileName);
				//TODO get the actual content type
				uploadData.setFileContentType("text/plain");
				fdir.mkdirs();
				File f = new File(fdir, fileName);
				FileUtils.copyFile(file, f);
				// save the file info.
				saveFileInfo(uploadData);
			}
			addActionMessage(UPLOAD_MESSAGE);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return Action.ERROR;
		}
	}

	private void saveFileInfo(UploadData uploadData) throws Exception {
		FileService fileService = new FileDaoService();
		fileService.insertUploadDetails(uploadData);
	}

}
