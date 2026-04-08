package org.example.taskmanagement.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private LocalDate dueDate;

    private boolean completed;

    public Task() {}

    public Task(String title, LocalDate dueDate, boolean completed) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Long getId()
    { return id; }

    public String getTitle() {
        return title; }
    public void setTitle(String title) {
        this.title = title; }

    public LocalDate getDueDate() {
        return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public boolean isCompleted() {
        return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
