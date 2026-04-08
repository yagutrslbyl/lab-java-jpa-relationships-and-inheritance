package org.example.taskmanagement.repository;

import org.example.taskmanagement.entity.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
