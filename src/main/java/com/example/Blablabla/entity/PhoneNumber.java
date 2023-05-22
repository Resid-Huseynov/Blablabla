package com.example.Blablabla.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phonenumber")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String phoneNumbers;

    public PhoneNumber() {
    }

    public PhoneNumber(int id, String phoneNumbers) {
        this.id = id;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "id=" + id +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }

}
