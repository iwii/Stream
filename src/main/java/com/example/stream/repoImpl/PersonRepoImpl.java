package com.example.stream.repoImpl;

import com.example.stream.dto.Address;
import com.example.stream.dto.Person;
import com.example.stream.enums.Gender;
import com.example.stream.repo.PersonRepo;
import com.example.stream.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepoImpl implements PersonRepo {

    @Autowired
    AddressService addressService;

    private String name = "Ala";
    private String lastName = "Kot";
    private int age;
    private Gender gender;
    private Address address;

    @Override
    public List<Person> getPerson() {

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            personList.add(new Person(name, lastName, i + 10, Gender.FEMALE, this.getAddress()));
            personList.add(new Person("Zbigniew", "Pies", i + 20, Gender.MALE, this.getAddress()));

        }
        personList.add(new Person("Coś", "Cosiowe",  20, Gender.OTHER, this.getAddress()));
        return personList;
    }

    @Override
    public List<Address> getAddress() {

        List<Address> addresses = new ArrayList<>();
        addresses = addressService.getAddress();

        return addresses;
    }
}
