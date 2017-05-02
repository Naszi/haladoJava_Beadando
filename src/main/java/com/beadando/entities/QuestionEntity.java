package com.beadando.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.beadando.model.Question;

@Entity
public class QuestionEntity {

	@Id
	@GeneratedValue
	private Long id;
    private String qtext;
    private boolean type;
    
    /* ------------------- */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public QuestionEntity(Question question) {
		super();
		this.qtext = question.getQtext();
		this.type = question.isType();
	}
	public QuestionEntity(String qtext, boolean type) {
		super();
		this.qtext = qtext;
		this.type = type;
	}
	public QuestionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
