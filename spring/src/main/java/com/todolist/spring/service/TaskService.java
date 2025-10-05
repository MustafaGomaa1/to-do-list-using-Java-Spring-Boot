package com.todolist.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.spring.Mapper;
import com.todolist.spring.Dto.TaskDto;
import com.todolist.spring.model.Task;
import com.todolist.spring.repository.TaskRepo;
import com.todolist.spring.service.Inter.ITaskService;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Override
    public Task createTask(TaskDto dto) {
        return taskRepo.save(Mapper.mapToTask(dto));
    }

    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = taskRepo.findAll();
        return tasks.stream().toList();
    }

    @Override
    public void updateTask(TaskDto dto) {
        taskRepo.save(Mapper.mapToTask(dto));
    }

    @Override
    public void deleteTask(Long id) {
        Task task = taskRepo.findById(id).orElseThrow();
        taskRepo.delete(task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepo.findById(id).orElseThrow();
    }

}
