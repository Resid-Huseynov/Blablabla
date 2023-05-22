package com.example.Blablabla.controller;

import com.example.Blablabla.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Blablabla.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<PersonDto> findAll() {
        return personService.findAll();
    }

    @GetMapping("persons/{personId}")
    public PersonDto findById (@PathVariable int personId) {

        PersonDto thePersonDto = personService.findById(personId);

        if (thePersonDto==null){
            throw new RuntimeException("Person id not found: " + personId);
        }
        return personService.findById(personId);
    }

    @PostMapping("/person/add")
    public PersonDto addPerson(@RequestBody PersonDto thePersonDto) {

        thePersonDto.setId(0);

        PersonDto dbPersonDto = personService.save(thePersonDto);
        return dbPersonDto;
    }

    @PutMapping("/person")
    public PersonDto updatePerson(@RequestBody PersonDto thePersonDto) {

        PersonDto dbPersonDto = personService.save(thePersonDto);
        return dbPersonDto;
    }

    @DeleteMapping("/person/{personId}")
    public String deletePerson(@PathVariable int personId) {

        PersonDto tempPersonDto = personService.findById(personId);

        if (tempPersonDto==null){
            throw new RuntimeException("Person id not found: " + personId);
        }
        personService.deleteById(personId);

        return "Deleted Person : " + personId;
    }
}
