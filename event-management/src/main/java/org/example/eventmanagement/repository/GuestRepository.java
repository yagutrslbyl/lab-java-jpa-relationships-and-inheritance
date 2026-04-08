package org.example.eventmanagement.repository;

import org.example.eventmanagement.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.example.eventmanagement.entity.GuestStatus;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {

    List<Guest> findByStatus(GuestStatus status);
}