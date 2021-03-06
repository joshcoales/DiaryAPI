package uk.co.coales.data;

// Generated 06-Dec-2015 19:35:43 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Routine generated by hbm2java
 */
public class Routine implements java.io.Serializable {

	private int routineId;
	private Account account;
	private String name;
	private Set routineItems = new HashSet(0);
	private Set routineRuns = new HashSet(0);

	public Routine() {
	}

	public Routine(int routineId, Account account, String name) {
		this.routineId = routineId;
		this.account = account;
		this.name = name;
	}

	public Routine(int routineId, Account account, String name,
			Set routineItems, Set routineRuns) {
		this.routineId = routineId;
		this.account = account;
		this.name = name;
		this.routineItems = routineItems;
		this.routineRuns = routineRuns;
	}

	public int getRoutineId() {
		return this.routineId;
	}

	public void setRoutineId(int routineId) {
		this.routineId = routineId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getRoutineItems() {
		return this.routineItems;
	}

	public void setRoutineItems(Set routineItems) {
		this.routineItems = routineItems;
	}

	public Set getRoutineRuns() {
		return this.routineRuns;
	}

	public void setRoutineRuns(Set routineRuns) {
		this.routineRuns = routineRuns;
	}

}
