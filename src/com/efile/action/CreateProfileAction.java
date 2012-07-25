/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.action;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.efile.common.Constants;
import com.efile.model.User;
import com.efile.services.UserDaoService;
import com.efile.services.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is used to create the profile and update it.
 */
public class CreateProfileAction extends ActionSupport implements
		ServletRequestAware {

	private static final long serialVersionUID = 1L;
	private String pan;
	private String pswd;
	private String fname;
	private String mname;
	private String lname;
	private String frname;
	private String optionsRadios;
	private String email;
	private String phone;
	private String addr;
	private String pin;
	private String residenceStatus;
	HttpServletRequest request;

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setFrname(String frname) {
		this.frname = frname;
	}

	public void setOptionsRadios(String optionsRadios) {
		this.optionsRadios = optionsRadios;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setResidenceStatus(String residenceStatus) {
		this.residenceStatus = residenceStatus;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public String save() throws Exception {
		try {
			User user = new User();
			user.setUid(this.pan);
			user.setUserName(this.fname);
			user.setPassword(this.pswd);
			user.setFirstName(this.fname);
			user.setMiddleName(this.mname);

			user.setLastName(this.lname);
			user.setFathersName(this.frname);
			user.setEmail(this.email);
			user.setPhone(this.phone);
			user.setAddress(this.addr);

			user.setPin(this.pin);
			user.setResidenceStatus(this.residenceStatus);
			user.setGender(this.optionsRadios);
			user.setDob(new Date(System.currentTimeMillis()));
			user.setPan(this.pan);
			UserService userService = new UserDaoService();
			userService.insertUser(user);
			this.request.setAttribute(Constants.USER_SESSION_ATTRIBUTE, user);
			// http://www.mkyong.com/struts2/struts-2-upload-multiple-files-example/
			return SUCCESS;
		} catch (Exception e) {
			addActionError(e.getMessage());
			return Action.ERROR;
		}

	}

}
