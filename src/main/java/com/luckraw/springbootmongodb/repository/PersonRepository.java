package com.luckraw.springbootmongodb.repository;

import com.luckraw.springbootmongodb.model.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
