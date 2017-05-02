package com.beadando.repositories;

import org.springframework.data.repository.CrudRepository;

import com.beadando.entities.QuestionEntity;


public interface QuestionRepository extends CrudRepository<QuestionEntity, Long>{

}
