package org.example.demohibernate.config;

import org.example.demohibernate.entity.Persons;
import org.example.demohibernate.repository.PersonsRepository;
import org.springframework.boot.CommandLineRunner;

import java.io.IOException;


public class DataInitializer implements CommandLineRunner{

    private final PersonsRepository personsRepository;


    public DataInitializer(final PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

   @Override
    public void run(String... args) throws IOException {
        personsRepository.save(new Persons("Olga", "Karpova", 30, "1234567890", "Moscow"));
        personsRepository.save(new Persons("Dmitry", "Ivanov", 25, "0987654321", "Los Angeles"));
        personsRepository.save(new Persons("Ivan", "Sergeev", 21, "0987654429", "Moscow"));
    }
}
