/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.model;

import java.util.Date;

/**
 * set and get the file upload data.
 */
public class UploadData {

	private int uploadId;
	private String panNo;
	private String  fileName;
	private String filePath;
	private String fileContentType;
	private Date lastUpdatedTmstmp;
	private String year;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getUploadId() {
		return uploadId;
	}
	public void setUploadId(int uploadId) {
		this.uploadId = uploadId;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public Date getLastUpdatedTmstmp() {
		return lastUpdatedTmstmp;
	}
	public void setLastUpdatedTmstmp(Date lastUpdatedTmstmp) {
		this.lastUpdatedTmstmp = lastUpdatedTmstmp;
	}
}
