package com.example.Blablabla.mapper;

import com.example.Blablabla.dto.PersonDto;
import com.example.Blablabla.entity.Person;

public interface PersonMapper {

    PersonDto toDto(Person person);

    Person toEntity(PersonDto personDto);
}
