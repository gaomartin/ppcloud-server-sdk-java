/**
 * PPLive Inc.
 * Copyright (c) 2007-2016 All Rights Reserved.
 */

package com.pplive.ppcloud.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author chaogao
 *
 */
public class LiveWatchRequest {

	/**
	 * 视频webid
	 */
	@JsonProperty("channel_web_id")
	private String channelWebId;
	
	/**
	 * 客户端Ip
	 */
	@JsonIgnore
	private String clientIp;

	/**
	 * 生成Token过期时间
	 * 默认60分钟
	 */
	private Integer expireInMinutes = 60;

	/**
	 * 设备类型
	 */
	@JsonProperty("device_type")
	private String deviceType;

	public String getChannelWebId() {
		return channelWebId;
	}

	public void setChannelWebId(String channelWebId) {
		this.channelWebId = channelWebId;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public Integer getExpireInMinutes() {
		return expireInMinutes;
	}

	public void setExpireInMinutes(Integer expireInMinutes) {
		this.expireInMinutes = expireInMinutes;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
}
