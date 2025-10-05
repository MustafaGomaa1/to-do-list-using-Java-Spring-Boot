package com.todolist.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.todolist.spring.Mapper;
import com.todolist.spring.Dto.TaskDto;
import com.todolist.spring.model.Task;
import com.todolist.spring.service.TaskService;

import jakarta.validation.Valid;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task/new")
    public String create(Model model) {
        model.addAttribute("task", new Task());
        return "create.html";
    }

    @PostMapping("/task/new")
    public String create(@Valid @ModelAttribute("task") TaskDto taskDto, BindingResult result) {
        if (result.hasErrors()) {
            return "create.html";
        }
        taskService.createTask(taskDto);
        return "redirect:/task/list";
    }

    @GetMapping("/task/list")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "get.html";
    }

    @GetMapping("/task/delete/{taskId}")
    public String deleteTask(@PathVariable("taskId") Long taskId) {
        taskService.deleteTask(taskId);
        return "redirect:/task/list";
    }

    @GetMapping("/task/edit/{taskId}")
    public String update(@PathVariable("taskId") Long taskId, Model model) {
        Task task = taskService.getTaskById(taskId);
        model.addAttribute("task", task);
        return "edit.html";
    }

    @PostMapping("/task/edit/{taskId}")
    public String update(@Valid @ModelAttribute("task") TaskDto taskDto, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.html";
        }
        taskService.updateTask(taskDto);
        return "redirect:/task/list";
    }

    @GetMapping("/task/view/{taskId}")
    public String view(@PathVariable("taskId") Long taskId, Model model) {
        TaskDto task = Mapper.mapToTaskDto(taskService.getTaskById(taskId));
        model.addAttribute("task", task);
        return "view.html";
    }

}
