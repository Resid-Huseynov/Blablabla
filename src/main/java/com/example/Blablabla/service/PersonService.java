package com.example.Blablabla.service;

import com.example.Blablabla.dto.PersonDto;

import java.util.List;

public interface PersonService {

    List<PersonDto> findAll();

    PersonDto findById(int theId);

    PersonDto save(PersonDto personDto);

    void deleteById(int theId);

}
