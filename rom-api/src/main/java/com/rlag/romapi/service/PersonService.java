package com.rlag.romapi.service;

import com.rlag.romapi.model.entity.Person;
import com.rlag.romapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> allPerson(){
        return personRepository.findAll();
    }
}
