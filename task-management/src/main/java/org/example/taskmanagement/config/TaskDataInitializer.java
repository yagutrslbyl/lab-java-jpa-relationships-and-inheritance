package org.example.taskmanagement.config;

import org.example.taskmanagement.entity.BillableTask;
import org.example.taskmanagement.entity.InternalTask;
import org.example.taskmanagement.repository.BillableTaskRepository;
import org.example.taskmanagement.repository.InternalTaskRepository;
import org.example.taskmanagement.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class TaskDataInitializer {

    @Bean
    CommandLineRunner initTasks(
            TaskRepository taskRepo,
            BillableTaskRepository billableRepo,
            InternalTaskRepository internalRepo
    ) {
        return args -> {


            BillableTask t1 = new BillableTask(
                    "Develop API",
                    LocalDate.now().plusDays(3),
                    false,
                    new BigDecimal("50")
            );

            BillableTask t2 = new BillableTask(
                    "Fix Bugs",
                    LocalDate.now().plusDays(1),
                    true,
                    new BigDecimal("30")
            );


            InternalTask t3 = new InternalTask(
                    "Team Meeting",
                    LocalDate.now(),
                    false
            );

            InternalTask t4 = new InternalTask(
                    "Code Review",
                    LocalDate.now().plusDays(2),
                    true
            );

            taskRepo.saveAll(List.of(t1, t2, t3, t4));
        };
    }}