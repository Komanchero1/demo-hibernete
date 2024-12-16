package org.example.demohibernate.config;

import org.example.demohibernate.entity.Persons;
import org.example.demohibernate.repository.PersonsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PersonsRepository personsRepository;


    public DataInitializer(final PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    private void saveIfNotExists(Persons person) {
        if (personsRepository.getPersonsByCity(person.getCityOfLiving()).isEmpty()) {
            personsRepository.save(person);
        }
    }

    @Override
    public void run(String... args) throws IOException {
        saveIfNotExists(new Persons("Olga", "Karpova", 30, "1234567890", "Moscow"));
        saveIfNotExists(new Persons("Dmitry", "Ivanov", 25, "0987654321", "Los Angeles"));
        saveIfNotExists(new Persons("Ivan", "Sergeev", 21, "0987654429", "Moscow"));
    }

}
