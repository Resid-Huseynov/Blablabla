package com.example.Blablabla.mapper;

import com.example.Blablabla.dto.PersonDto;
import com.example.Blablabla.entity.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonMapperImpl implements PersonMapper{

    public PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setId(person.getId());
        dto.setFin(person.getFin());
        dto.setName(person.getName());
        dto.setSurname(person.getSurname());
        dto.setPhoneNumbers(person.getPhoneNumbers());
        return dto;
    }

    @Override
    public Person toEntity(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getId());
        person.setFin(personDto.getFin());
        person.setName(personDto.getName());
        person.setSurname(personDto.getSurname());
        person.setPhoneNumbers(personDto.getPhoneNumbers());
        return person;
    }

    public static List<PersonDto> toPersonDtoList(List<Person> personList) {
        List<PersonDto> dtoList = new ArrayList<>();

        for (Person person : personList) {
            PersonDto dto = new PersonDto();
            dto.setId(person.getId());
            dto.setFin(person.getFin());
            dto.setName(person.getName());
            dto.setSurname(person.getSurname());
            dto.setPhoneNumbers(person.getPhoneNumbers());

            dtoList.add(dto);
        }

        return dtoList;
    }
}

