package com.example.Blablabla.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String fin;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToMany
    @JoinColumn(name = "person_id")
    private List<PhoneNumber> phoneNumbers;

    public Person() {
    }

    public Person(String fin, String name, String surname) {
        this.fin = fin;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId(){ return id; }

    public void setId(int id) {
        this.id = id;
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
        return "Person{" +
                "fin='" + fin + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }


}
