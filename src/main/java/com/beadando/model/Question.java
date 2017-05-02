package com.beadando.model;

public class Question {

    private String qtext;
    private boolean type;
	
    public Question(String qtext, boolean type) {
		super();
		this.qtext = qtext;
		this.type = type;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQtext() {
		return qtext;
	}

	public void setQtext(String qtext) {
		this.qtext = qtext;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
    

	
}
