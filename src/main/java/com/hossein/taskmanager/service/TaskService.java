package com.hossein.taskmanager.service;

import com.hossein.taskmanager.entity.Task;
import com.hossein.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class TaskService {

    //get Repository
    public final TaskRepository taskRepository;         
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository= taskRepository;
    }
    //creat Task
    public Task createTask(Task task) {
        task.setCreatedAt(LocalDateTime.now());
        return taskRepository.save(task);
    }
    //get Task
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
