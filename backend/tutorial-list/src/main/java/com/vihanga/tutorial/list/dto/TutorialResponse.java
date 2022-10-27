package com.vihanga.tutorial.list.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TutorialResponse {
    private String id;
    private String title;
    private String description;
    private boolean isPublished;
}
