package com.example.stream.controller;

import com.example.stream.dto.Person;
import com.example.stream.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPerson() {

        List<Person> personList = new ArrayList<>();

        personList = personService.getPersonList();

        return personList;
    }
}
