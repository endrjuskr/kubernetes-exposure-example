package com.fancy.api;

import com.fancy.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> findAll() {
        return (List<Person>) repository.findAll();
    }
}
