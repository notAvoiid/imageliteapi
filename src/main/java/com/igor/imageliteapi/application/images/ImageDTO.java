package com.igor.imageliteapi.application.images;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class ImageDTO {

    private String url;
    private String name;
    private String extension;
    private Long size;
    private LocalDate uploadDate;

}
