package com.vihanga.tutorial.list.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TutorialRequest {

    private String title;
    private String description;
    private boolean isPublished;
}
