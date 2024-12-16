package org.example.demohibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@IdClass(PersonId.class)
public class Persons {

    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private String phone_number;
    private String city_of_living;

    public Persons() {

    }

    public Persons(String name, String surname, int age, String phone_number, String city_of_living) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
