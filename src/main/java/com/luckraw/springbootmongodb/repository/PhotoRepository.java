package com.luckraw.springbootmongodb.repository;

import com.luckraw.springbootmongodb.model.entity.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends MongoRepository<Photo, String> {
}
