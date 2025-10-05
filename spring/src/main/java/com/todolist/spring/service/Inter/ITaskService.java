package com.todolist.spring.service.Inter;

import java.util.List;

import com.todolist.spring.Dto.TaskDto;
import com.todolist.spring.model.Task;

public interface ITaskService {
    Task createTask(TaskDto dto);

    List<Task> getAllTasks();

    void updateTask(TaskDto dto);

    void deleteTask(Long id);

    Task getTaskById(Long id);
}
