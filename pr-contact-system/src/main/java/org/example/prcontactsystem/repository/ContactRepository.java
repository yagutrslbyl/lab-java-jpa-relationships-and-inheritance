package org.example.prcontactsystem.repository;

import org.example.prcontactsystem.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
