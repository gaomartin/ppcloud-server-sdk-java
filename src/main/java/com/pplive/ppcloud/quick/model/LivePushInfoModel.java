/**
 * PPLive Inc.
 * Copyright (c) 2007-2016 All Rights Reserved.
 */
package com.pplive.ppcloud.quick.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author chaogao
 *
 */
public class LivePushInfoModel {
	
	/**
	 * 视频webid
	 */
	private String channelWebId;
	
	/**
	 * 推流地址
	 */
	private String pushUrl;
	
	/**
	 * 推流鉴权信息
	 */
	private String token;
	
	/**
	 * 错误代码
	 */
	@JsonIgnore
	public String err = "0";
	
	/**
	 * 错误信息
	 */
	@JsonIgnore
	public String msg;

	public String getChannelWebId() {
		return channelWebId;
	}

	public void setChannelWebId(String channelWebId) {
		this.channelWebId = channelWebId;
	}

	public String getPushUrl() {
		return pushUrl;
	}

	public void setPushUrl(String pushUrl) {
		this.pushUrl = pushUrl;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}