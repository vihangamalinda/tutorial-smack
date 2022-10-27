package com.vihanga.tutorial.list.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tutorials")
@Builder
public class Tutorial {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean isPublished;
}
