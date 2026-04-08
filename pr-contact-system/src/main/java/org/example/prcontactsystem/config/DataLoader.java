package org.example.prcontactsystem.config;

import org.example.prcontactsystem.model.Contact;
import org.example.prcontactsystem.model.Name;
import org.example.prcontactsystem.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

@Bean
CommandLineRunner loadData(ContactRepository contactRepository) {

    return args -> {
        contactRepository.save(new Contact("Google", "engineer", new Name("Miss","yagut", "ruby", "rasulbayli")));


    };

}


}
