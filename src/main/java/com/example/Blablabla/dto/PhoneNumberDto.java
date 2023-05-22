package com.example.Blablabla.dto;

public class    PhoneNumberDto {

    private int id;

    private String phoneNumbers;

    public PhoneNumberDto() {

    }

    public PhoneNumberDto(int id, String phoneNumbers) {
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
        return "PhoneNumberDto{" +
                "id=" + id +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                '}';
    }
}
