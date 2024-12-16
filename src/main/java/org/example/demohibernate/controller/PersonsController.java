package org.example.demohibernate.controller;

import org.example.demohibernate.entity.Persons;
import org.example.demohibernate.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {

    @Autowired
    private PersonsRepository personsRepository;


    @GetMapping("/persons/by-city")
    public List<Persons>getPersonsByCity(@RequestParam String citi) {
        return personsRepository.getPersonsByCiti(citi);
    }
}
