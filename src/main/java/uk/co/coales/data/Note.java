package uk.co.coales.data;

// Generated 06-Dec-2015 19:35:43 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Note generated by hbm2java
 */
public class Note implements java.io.Serializable {

	private int noteId;
	private Account account;
	private NoteCategory noteCategory;
	private String title;
	private String body;
	private Date timeCreated;
	private Date timeEdited;

	public Note() {
	}

	public Note(int noteId, Account account, String title, String body,
			Date timeCreated, Date timeEdited) {
		this.noteId = noteId;
		this.account = account;
		this.title = title;
		this.body = body;
		this.timeCreated = timeCreated;
		this.timeEdited = timeEdited;
	}

	public Note(int noteId, Account account, NoteCategory noteCategory,
			String title, String body, Date timeCreated, Date timeEdited) {
		this.noteId = noteId;
		this.account = account;
		this.noteCategory = noteCategory;
		this.title = title;
		this.body = body;
		this.timeCreated = timeCreated;
		this.timeEdited = timeEdited;
	}

	public int getNoteId() {
		return this.noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public NoteCategory getNoteCategory() {
		return this.noteCategory;
	}

	public void setNoteCategory(NoteCategory noteCategory) {
		this.noteCategory = noteCategory;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public Date getTimeEdited() {
		return this.timeEdited;
	}

	public void setTimeEdited(Date timeEdited) {
		this.timeEdited = timeEdited;
	}

}
