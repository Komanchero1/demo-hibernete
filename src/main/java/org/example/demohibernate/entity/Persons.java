package org.example.demohibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(PersonId.class)
public class Persons {

    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    private String phoneNumber; // Используйте camelCase

    private String cityOfLiving; // Используйте camelCase

    public Persons() {
    }

    public Persons(String name, String surname, int age, String phoneNumber, String cityOfLiving) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber; // Исправлено
        this.cityOfLiving = cityOfLiving; // Исправлено
    }

}


