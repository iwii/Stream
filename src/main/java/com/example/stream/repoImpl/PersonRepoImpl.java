package com.example.stream.repoImpl;

import com.example.stream.dto.Person;
import com.example.stream.repo.PersonRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepoImpl implements PersonRepo {

    private String name = "Ala";
    private String lastName = "Kot";
    private int age;
    private String gender;

    @Override
    public List<Person> getPerson() {

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            personList.add(new Person(name, lastName, i + 10, "FEM"));
        }
        return personList;
    }
}
