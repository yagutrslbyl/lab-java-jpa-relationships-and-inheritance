package org.example.eventmanagement.repository;

import org.example.eventmanagement.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
