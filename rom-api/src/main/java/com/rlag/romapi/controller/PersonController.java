package com.rlag.romapi.controller;

import com.rlag.romapi.model.entity.Person;
import com.rlag.romapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @GetMapping
    public List<Person> allPerson(){
        return personService.allPerson();
    }
}
