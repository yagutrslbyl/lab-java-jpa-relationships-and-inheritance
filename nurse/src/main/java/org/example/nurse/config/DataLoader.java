package org.example.nurse.config;

import org.example.nurse.entity.Association;
import org.example.nurse.entity.Division;
import org.example.nurse.entity.Member;
import org.example.nurse.entity.MemberStatus;
import org.example.nurse.repository.AssociationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(AssociationRepository associationRepository) {
        return args -> {
            Association association = new Association();
            association.setName("Nurse Association of Spain");

            List<Division> divisions = new ArrayList<>();


            for (int i = 1; i <= 7; i++) {
                Division division = new Division("Division " + i, "District " + i);
                Member member = new Member(
                        "Member " + i,
                        MemberStatus.ACTIVE,
                        LocalDate.now().plusDays(30)
                );

                member.setDivision(division);
                division.setMembers(List.of(member));
                division.setPresident(member);

                division.setAssociation(association);

                divisions.add(division);

            }
            association.setDivisions(divisions);

            associationRepository.save(association);
    };
}}
