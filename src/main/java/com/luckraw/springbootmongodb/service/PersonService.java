package com.luckraw.springbootmongodb.service;

import com.luckraw.springbootmongodb.model.entity.Person;

import java.util.List;

public interface PersonService {

    Person save(Person person);

    List<Person> getPersonStartWith(String name);
}
