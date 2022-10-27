package com.vihanga.tutorial.list.repository;

import com.vihanga.tutorial.list.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TutorialRepository extends MongoRepository<Tutorial,String> {
}
