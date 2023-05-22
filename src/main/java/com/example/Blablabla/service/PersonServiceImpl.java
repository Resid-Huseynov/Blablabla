package com.example.Blablabla.service;

import com.example.Blablabla.dto.PersonDto;
import com.example.Blablabla.repository.PersonRepository;
import jakarta.transaction.Transactional;
import com.example.Blablabla.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private PersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public List<PersonDto> findAll() {

        return personRepository.findAll().stream().map(personMapper::toDto).toList();
    }

    @Override
    public PersonDto findById(int theId) {

        return personMapper.toDto(personRepository.findById(theId)
                .orElseThrow(() -> new RuntimeException("Person by id : " + theId + " not found")));
    }

    @Override
    @Transactional
    public PersonDto save(PersonDto personDto) {

        return personMapper.toDto(personRepository.save(personMapper.toEntity(personDto)));
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        personRepository.deleteById(theId);
    }
}
