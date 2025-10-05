package com.todolist.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.spring.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
