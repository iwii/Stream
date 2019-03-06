package com.example.stream.serviceImpl;

import com.example.stream.dto.Person;
import com.example.stream.enums.Gender;
import com.example.stream.repo.PersonRepo;
import com.example.stream.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepo personRepo;


    @Override
    public List<Person> getPerson() {

        return personRepo.getPerson();
    }

    @Override
    public List<Person> getPersonList() {

        Optional<List<Person>> optionalPersonList = Optional.ofNullable(this.getPerson());

        return optionalPersonList
                .map(List::stream).orElseGet(Stream::empty)
                .filter(Objects::nonNull)
                //.filter(x -> "Ala".equals(x.getName()) && (14 == x.getAge() || 15 == x.getAge() ))
                //.filter(x -> "MALE".equals(x.getGender().toString()))
                .filter(x -> Gender.FEMALE.equals(x.getGender()))
                .collect(Collectors.toList());
    }
}
