package com.hossein.taskmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hossein.taskmanager.dto.CreateTaskRequest;
import com.hossein.taskmanager.dto.TaskResponse;
import com.hossein.taskmanager.entity.Task;
import com.hossein.taskmanager.service.TaskService;

@RestController
@RequestMapping("/tasks")


public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService= taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        return taskService.createTask(createTaskRequest);
    }

    @GetMapping
    public List<TaskResponse> getAllTasks() {
        return taskService.getAllTasks();
    }

}
