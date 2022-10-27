package com.vihanga.tutorial.list.service;

import com.vihanga.tutorial.list.dto.TutorialRequest;
import com.vihanga.tutorial.list.dto.TutorialResponse;

import java.util.List;

public interface TutorialService {
    List<TutorialResponse> getAll();

    TutorialResponse createTutorial(TutorialRequest tutorialRequest);

    TutorialResponse getTutotrialById(String id);

    TutorialResponse deleteTutorial(String id);

    TutorialResponse updateTutorial(String id);
}
