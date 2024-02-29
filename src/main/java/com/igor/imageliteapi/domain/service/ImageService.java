package com.igor.imageliteapi.domain.service;

import com.igor.imageliteapi.domain.entity.Image;
import com.igor.imageliteapi.domain.enums.ImageExtension;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> findById(String id);

    List<Image> search(ImageExtension extension, String query);

}
