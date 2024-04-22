package com.enotes;

public class Notes {
	
	private int id;
	private String title;
	private String content;
	private String emailid;
	private String creationDate;
	private String updationDate;
	
	public Notes() {
		super();
	}
	
	public Notes(String title, String content, String emailid) {
		super();
		this.title = title;
		this.content = content;
		this.emailid = emailid;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	public String getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(String updationDate) {
		this.updationDate = updationDate;
	}
	
	@Override
	public String toString() {
		return "Notes [id=" + id + ", title=" + title + ", content=" + content + ", emailid=" + emailid
				+ ", creationDate=" + creationDate + ", updationDate=" + updationDate + "]";
	}	

}
