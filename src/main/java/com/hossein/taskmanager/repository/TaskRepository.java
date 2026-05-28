package com.hossein.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hossein.taskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    //save 
    //findAll
    //delete
    //update

}
