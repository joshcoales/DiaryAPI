package uk.co.coales.data;

// Generated 06-Dec-2015 19:35:43 by Hibernate Tools 4.0.0

import java.io.Serializable;
import java.util.Date;

/**
 * SessionToken generated by hbm2java
 */
public class SessionToken implements java.io.Serializable {

	private int sessionTokenId;
	private Account account;
	private String token;
	private Serializable ipAddr;
	private Date timeCreated;
	private Date timeUsed;

	public SessionToken() {
	}

	public SessionToken(int sessionTokenId, Account account, String token,
			Serializable ipAddr, Date timeCreated, Date timeUsed) {
		this.sessionTokenId = sessionTokenId;
		this.account = account;
		this.token = token;
		this.ipAddr = ipAddr;
		this.timeCreated = timeCreated;
		this.timeUsed = timeUsed;
	}

	public int getSessionTokenId() {
		return this.sessionTokenId;
	}

	public void setSessionTokenId(int sessionTokenId) {
		this.sessionTokenId = sessionTokenId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Serializable getIpAddr() {
		return this.ipAddr;
	}

	public void setIpAddr(Serializable ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Date getTimeUsed() {
		return this.timeUsed;
	}

	public void setTimeUsed(Date timeUsed) {
		this.timeUsed = timeUsed;
	}

}
