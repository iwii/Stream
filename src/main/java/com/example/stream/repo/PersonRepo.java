package com.example.stream.repo;

import com.example.stream.dto.Address;
import com.example.stream.dto.Person;

import java.util.List;

public interface PersonRepo {

    List<Person> getPerson();

    List<Address> getAddress();
}
