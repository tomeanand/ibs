/**
 * @Copyright -
 * @author pnakulan.
 * @date 16-july-2012.
 */
package com.efile.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is used to trigger the error action.
 */
public class ErrorAction extends ActionSupport {

	/**
	 * Class used for error action.
	 */
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
			return ERROR;
	 }
	}
