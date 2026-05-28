package com.hossein.taskmanager.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tasks") //creatt table

public class Task {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;
    private String title;
    private String descreption;
    private boolean completed;
    private LocalDateTime createdAt;

    public Task() {}

    public Task(String title, String descreption, boolean completed, LocalDateTime createdAt) {
        this.title= title;
        this.descreption= descreption;
        this.completed= completed;
        this.createdAt= createdAt;
    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title= title;
    }
    public String getDescreption() {
        return descreption;
    }
    public void setDescreption(String descreption) {
        this.descreption= descreption;
    }
    public boolean  getCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed= completed;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.createdAt= createdAt;
    }
}
