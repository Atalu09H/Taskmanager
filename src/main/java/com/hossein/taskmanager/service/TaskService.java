package com.hossein.taskmanager.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hossein.taskmanager.dto.CreateTaskRequest;
import com.hossein.taskmanager.dto.TaskResponse;
import com.hossein.taskmanager.entity.Task;
import com.hossein.taskmanager.repository.TaskRepository;

// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.PageRequest;

@Service

public class TaskService {

    public Task respons;
    //create Repository
    public final TaskRepository taskRepository;         
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    //creat Task
    public Task createTask(CreateTaskRequest createTaskRequest) {
        Task task = new Task();
        task.setTitle(createTaskRequest.getTitle());
        task.setDescreption(createTaskRequest.getDescription());
        task.setCompleted();
        task.setCreatedAt(LocalDateTime.now());
        // Task.setCompleted(true);
        return taskRepository.save(task);
    }
    
    //get Task
    public List<TaskResponse> getAllTasks() {
        // Pageable pagable = PageRequest.of(0,5);
        // Page<Task> page = taskRepository.findAll(pagable);
        List<Task> tasks = taskRepository.findAll();
        // TaskResponse response = new TaskResponse();
        List<TaskResponse> response = tasks.stream()
        .map(task -> new TaskResponse(task.getId(), task.getTitle(), task.isCompleted()))
        .toList();
        return response;
    }
}
