package com.hossein.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    // public void setCreatedAt(LocalDateTime now);
    //save 
    //findAll
    //delete
    //update

}
