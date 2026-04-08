package org.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.eventmanagement.entity.Speaker;


public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
