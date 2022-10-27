package com.vihanga.tutorial.list.service;

import com.vihanga.tutorial.list.dto.TutorialRequest;
import com.vihanga.tutorial.list.dto.TutorialResponse;
import com.vihanga.tutorial.list.model.Tutorial;
import com.vihanga.tutorial.list.repository.TutorialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TutorialServiceImpl implements  TutorialService{

    private final TutorialRepository tutorialRepository;

    @Override
    public List<TutorialResponse> getAll() {
        List<Tutorial> tutorialResponse = tutorialRepository.findAll();
       List<TutorialResponse> tutorialResponseList = tutorialResponse.stream().map(tutorial -> tutorialToTutorialResponse(tutorial)).collect(Collectors.toList());
        return tutorialResponseList;
    }

    @Override
    public TutorialResponse createTutorial(TutorialRequest tutorialRequest) {
        Tutorial tutorial = tutorialRequestToTutorial(tutorialRequest);
        Tutorial tutorial1 = tutorialRepository.save(tutorial);
        TutorialResponse tutorialResponse = tutorialToTutorialResponse(tutorial1);
        return tutorialResponse;
    }

    @Override
    public TutorialResponse getTutotrialById(String id) {
        Tutorial tutorial = tutorialRepository.findById(id).orElseThrow(()-> new RuntimeException("This id was not found: "+id));
        TutorialResponse tutorialResponse = tutorialToTutorialResponse(tutorial);

        return tutorialResponse;
    }

    @Override
    public TutorialResponse deleteTutorial(String id) {
        Tutorial tutorial = tutorialRepository.findById(id).orElseThrow(()-> new RuntimeException("This id was not found: "+id));
        tutorialRepository.deleteById(id);
        TutorialResponse tutorialResponse = tutorialToTutorialResponse(tutorial);

        return tutorialResponse;
    }

    @Override
    public TutorialResponse updateTutorial(String id) {
        return null;
    }

    private TutorialResponse tutorialToTutorialResponse(Tutorial tutorial){
       return TutorialResponse.builder()
                .id(tutorial.getId())
                .title(tutorial.getTitle())
                .description(tutorial.getDescription())
                .isPublished(tutorial.isPublished())
                .build();

    }

    private Tutorial tutorialRequestToTutorial(TutorialRequest tutorialRequest){
        return Tutorial.builder()
                .title(tutorialRequest.getTitle())
                .description(tutorialRequest.getDescription())
                .isPublished(tutorialRequest.isPublished())
                .build();
    }
}
