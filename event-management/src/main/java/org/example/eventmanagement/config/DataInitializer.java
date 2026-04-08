package org.example.eventmanagement.config;

import org.example.eventmanagement.entity.*;
import org.example.eventmanagement.repository.ConferenceRepository;
import org.example.eventmanagement.repository.ExhibitionRepository;
import org.example.eventmanagement.repository.GuestRepository;
import org.example.eventmanagement.repository.SpeakerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(
            GuestRepository guestRepo,
            SpeakerRepository speakerRepo,
            ConferenceRepository conferenceRepo,
            ExhibitionRepository exhibitionRepo
    ) {
        return args -> {

            Guest g1 = new Guest("Ali", GuestStatus.ATTENDING);
            Guest g2 = new Guest("Aysel", GuestStatus.NOT_ATTENDING);
            Guest g3 = new Guest("Murad", GuestStatus.NO_RESPONSE);

            guestRepo.saveAll(List.of(g1, g2, g3));


            Speaker s1 = new Speaker("John", 60);
            Speaker s2 = new Speaker("Emma", 45);

            Speaker s3 = new Speaker("David", 30);

            speakerRepo.saveAll(List.of(s1, s2, s3));

            Conference conf1 = new Conference(
                    "Tech Conference",
                    LocalDate.now(),
                    120,
                    "Baku",
                    List.of(g1, g2),
                    List.of(s1, s2)
            );

            Conference conf2 = new Conference(
                    "AI Summit",
                    LocalDate.now().plusDays(1),
                    180,
                    "London",
                    List.of(g2, g3),
                    List.of(s2, s3)
            );

            conferenceRepo.saveAll(List.of(conf1, conf2));

            Exhibition ex1 = new Exhibition(
                    "Art Expo",
                    LocalDate.now(),
                    90,
                    "Paris",
                    List.of(g1, g3)
            );

            Exhibition ex2 = new Exhibition(
                    "Science Fair",
                    LocalDate.now().plusDays(2),
                    100,
                    "Berlin",
                    List.of(g2)
            );

            exhibitionRepo.saveAll(List.of(ex1, ex2));
        };
    }
}

