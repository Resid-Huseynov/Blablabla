package com.example.Blablabla.dto;

import com.example.Blablabla.entity.PhoneNumber;

import java.util.List;

public class PersonDto {

    private int id;

    private String fin;

    private String name;

    private String surname;

    private List<PhoneNumber> phoneNumbers;

    public PersonDto() {

    }

    public PersonDto(String fin, String name, String surname, List<PhoneNumber> phoneNumbers) {
        this.fin = fin;
        this.name = name;
        this.surname = surname;
        this.phoneNumbers = phoneNumbers;
    }

    public Integer getId(){return id;}

    public void setId(Integer id) {this.id= id;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", fin='" + fin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
