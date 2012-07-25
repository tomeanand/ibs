/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.efile.common.Constants;
import com.efile.model.UploadData;
import com.efile.model.User;
import com.efile.services.FileDaoService;
import com.efile.services.FileService;
import com.efile.services.UserDaoService;
import com.efile.services.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Login Action to validate the login 
 */
public class LoginAction extends ActionSupport implements ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private String pswd;
	private String pan;
	HttpServletRequest request;

	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String execute() throws Exception {
		try {
			UserService userService = new UserDaoService();
			User user = userService.isValidUser(this.pan, this.pswd);
			String result = user != null ? SUCCESS : "failure";
			request.getSession().setAttribute(Constants.USER_SESSION_ATTRIBUTE, user);
			request.setAttribute(Constants.USER_SESSION_ATTRIBUTE, user);
			FileService fileService = new FileDaoService();
			List<UploadData> uploadData = fileService.getAllUploadFiles(user.getUid());
			request.setAttribute(Constants.UPLOAD_SESSION_ATTRIBUTE, uploadData);
			return result;
		} catch (Exception e) {
			addActionError(e.getMessage());
			return Action.ERROR;
		}
	}

}
