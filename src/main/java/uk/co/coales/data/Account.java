package uk.co.coales.data;

// Generated 06-Dec-2015 19:35:43 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

	private int accountId;
	private String username;
	private String email;
	private boolean passHash;
	private boolean passSalt;
	private int failedLogins;
	private Date lockoutTime;
	private Set noteCategories = new HashSet(0);
	private Set routines = new HashSet(0);
	private Set lists = new HashSet(0);
	private Set entries = new HashSet(0);
	private Set notes = new HashSet(0);
	private Set sessionTokens = new HashSet(0);

	public Account() {
	}

	public Account(int accountId, String username, String email,
			boolean passHash, boolean passSalt, int failedLogins) {
		this.accountId = accountId;
		this.username = username;
		this.email = email;
		this.passHash = passHash;
		this.passSalt = passSalt;
		this.failedLogins = failedLogins;
	}

	public Account(int accountId, String username, String email,
			boolean passHash, boolean passSalt, int failedLogins,
			Date lockoutTime, Set noteCategories, Set routines, Set lists,
			Set entries, Set notes, Set sessionTokens) {
		this.accountId = accountId;
		this.username = username;
		this.email = email;
		this.passHash = passHash;
		this.passSalt = passSalt;
		this.failedLogins = failedLogins;
		this.lockoutTime = lockoutTime;
		this.noteCategories = noteCategories;
		this.routines = routines;
		this.lists = lists;
		this.entries = entries;
		this.notes = notes;
		this.sessionTokens = sessionTokens;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isPassHash() {
		return this.passHash;
	}

	public void setPassHash(boolean passHash) {
		this.passHash = passHash;
	}

	public boolean isPassSalt() {
		return this.passSalt;
	}

	public void setPassSalt(boolean passSalt) {
		this.passSalt = passSalt;
	}

	public int getFailedLogins() {
		return this.failedLogins;
	}

	public void setFailedLogins(int failedLogins) {
		this.failedLogins = failedLogins;
	}

	public Date getLockoutTime() {
		return this.lockoutTime;
	}

	public void setLockoutTime(Date lockoutTime) {
		this.lockoutTime = lockoutTime;
	}

	public Set getNoteCategories() {
		return this.noteCategories;
	}

	public void setNoteCategories(Set noteCategories) {
		this.noteCategories = noteCategories;
	}

	public Set getRoutines() {
		return this.routines;
	}

	public void setRoutines(Set routines) {
		this.routines = routines;
	}

	public Set getLists() {
		return this.lists;
	}

	public void setLists(Set lists) {
		this.lists = lists;
	}

	public Set getEntries() {
		return this.entries;
	}

	public void setEntries(Set entries) {
		this.entries = entries;
	}

	public Set getNotes() {
		return this.notes;
	}

	public void setNotes(Set notes) {
		this.notes = notes;
	}

	public Set getSessionTokens() {
		return this.sessionTokens;
	}

	public void setSessionTokens(Set sessionTokens) {
		this.sessionTokens = sessionTokens;
	}

}
