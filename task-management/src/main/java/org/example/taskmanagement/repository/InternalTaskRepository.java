package org.example.taskmanagement.repository;

import org.example.taskmanagement.entity.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
