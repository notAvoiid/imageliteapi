package com.igor.imageliteapi.domain.service;

import com.igor.imageliteapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {

    Image save(Image image);

    Optional<Image> findById(String id);

}
