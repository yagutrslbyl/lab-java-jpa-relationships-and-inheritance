package org.example.taskmanagement.entity;

import jakarta.persistence.*;
import org.example.taskmanagement.entity.Task;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class BillableTask extends Task {

    private BigDecimal hourlyRate;


    public BillableTask() {}

    public BillableTask(String title, LocalDate dueDate, boolean completed, BigDecimal hourlyRate) {
        super(title, dueDate, completed);
        this.hourlyRate = hourlyRate;
    }


    public BigDecimal getHourlyRate() {
        return hourlyRate; }
    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate; }
}