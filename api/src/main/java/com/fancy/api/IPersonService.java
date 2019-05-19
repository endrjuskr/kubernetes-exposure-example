package com.fancy.api;

import com.fancy.api.model.Person;

import java.util.List;

public interface IPersonService {

    List<Person> findAll();
}