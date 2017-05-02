package com.beadando.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beadando.entities.QuestionEntity;
import com.beadando.model.Question;
import com.beadando.repositories.QuestionRepository;


@Service
public class AppService {

	
    private QuestionRepository questionRepository;
    
	@Autowired
    public AppService(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}	
	
	private List<Question> questionlist = new ArrayList<Question>();

    public Iterable<QuestionEntity> getQuestions() {
     
        return questionRepository.findAll();
    }
    public Boolean newQuestion(Question question) {

        questionRepository.save(new QuestionEntity(question));
        	return true;
    }	
	
}
