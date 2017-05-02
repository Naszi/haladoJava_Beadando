package com.beadando.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beadando.entities.QuestionEntity;
import com.beadando.model.Question;
import com.beadando.services.AppService;


@RestController
public class StudentController {

    private AppService appService;
    
    @Autowired
    public StudentController(AppService appService) {
        super();
        this.appService = appService;
    }
	
	
    @GetMapping(path="/question-list", produces="application/json")
    public Iterable<QuestionEntity> getQuestions() { 
    	      
    	return appService.getQuestions();
    }
 
    @PostMapping(path="/question", consumes="application/json", produces="application/json")
    public boolean addNewItem(@RequestBody @Valid Question question) {
        return appService.newQuestion(question);
    }
    
    
}