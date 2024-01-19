package com.luckraw.springbootmongodb.service;

import com.luckraw.springbootmongodb.model.entity.Person;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PersonService {

    Person save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);


    List<Person> getByPersonAge(Integer minAge, Integer maxAge);
}
