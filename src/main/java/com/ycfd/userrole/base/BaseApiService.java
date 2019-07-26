package com.ycfd.userrole.base;

import java.util.ArrayList;

/**
 * @author dl
 */
public class BaseApiService {

	public ResponResult setResultError(Integer code, String msg) {
		return setResult(code, msg, null);
	}

	/**
	 * 返回错误，可以传msg
	 */
	public ResponResult setResultError(String msg) {
		return setResult(500, msg, null);
	}

	/**
	 * 返回成功，可以传data值
	 * @param msgHead
	 * @return
	 */
	public ResponResult setResultSuccess(Object msgHead) {
		return setResult(200, "处理成功", msgHead);
	}
	public ResponResult setResultSuccess(Object msgHead,Object msgDetail) {
		return setResult(200, "处理成功", msgHead,msgDetail);
	}

	/**
	 * 返回成功，沒有data值
	 * @return
	 */
	public ResponResult setResultSuccess() {
		return setResult(200, "处理成功", null);
	}

	/**
	 * 返回成功，沒有data值
	 * @param msg
	 * @return
	 */
	public ResponResult setResultSuccess(String msg) {
		return setResult(200, msg, null);
	}

	/**
	 * 通用封装
	 * @param code
	 * @param msg
	 * @param msgHead
	 * @param msgDetail
	 * @return
	 */
	public ResponResult setResult(Integer code, String msg, Object msgHead, Object msgDetail) {
		return new ResponResult(code, msg, msgHead,msgDetail);
	}

	/**
	 * 通用封装
	 * @param code
	 * @param msg
	 * @param msgHead
	 * @return
	 */
	public ResponResult setResult(Integer code, String msg, Object msgHead) {
		return new ResponResult(code, msg, msgHead,new ArrayList());
	}

}
