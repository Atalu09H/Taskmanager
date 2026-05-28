package com.hossein.taskmanager.controller;

import com.hossein.taskmanager.entity.Task;
import com.hossein.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")


public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService= taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

}
