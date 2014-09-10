package com.duowan.dataswitch.input;

import java.util.List;

import com.duowan.dataswitch.BaseObject;

public class RapidQueueInput extends BaseObject implements Input{

	private String host;
	private int port;
	private String username;
	private String password;
	private String queue;
	private String vhost;
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQueue() {
		return queue;
	}

	public void setQueue(String queue) {
		this.queue = queue;
	}
	
	public String getVhost() {
		return vhost;
	}

	public void setVhost(String vhost) {
		this.vhost = vhost;
	}

	@Override
	public List<Object> read(int size) {
		return null;
	}

	@Override
	public void close() {
	}

}
