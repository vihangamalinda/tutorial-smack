package com.vihanga.tutorial.list.controller;

import com.vihanga.tutorial.list.dto.TutorialRequest;
import com.vihanga.tutorial.list.dto.TutorialResponse;
import com.vihanga.tutorial.list.service.TutorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorial")
@RequiredArgsConstructor
public class TutorialController {

    private final TutorialService tutorialService;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<TutorialResponse> getAll(){

        return tutorialService.getAll();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public TutorialResponse createTutorial(@RequestBody TutorialRequest tutorialRequest){
        return tutorialService.createTutorial(tutorialRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TutorialResponse getTutotrialById(@PathVariable("id") String id){
        return tutorialService.getTutotrialById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TutorialResponse deleteTutorial(@PathVariable("id") String id){
        TutorialResponse tutorialResponse = tutorialService.deleteTutorial(id);
        return tutorialResponse;
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TutorialResponse updateTutorial(@PathVariable("id") String id){
        return tutorialService.updateTutorial(id);
    }

}
