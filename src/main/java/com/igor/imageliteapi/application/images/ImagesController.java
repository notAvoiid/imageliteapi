package com.igor.imageliteapi.application.images;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/v1/images")
@Slf4j
public class ImagesController {

    @PostMapping
    public ResponseEntity<?> save(
            @RequestParam(value = "file", required = true) MultipartFile file,
            @RequestParam(value = "name", required = true) String name,
            @RequestParam(value = "tags", required = true) List<String> tags
    ){
        log.info("Image received: name: {}, size: {}", file.getOriginalFilename(), file.getSize());
        log.info("Name defined to image: {}", name);
        log.info("Image tags is: {}", tags);
        return ResponseEntity.ok().build();
    }

}
