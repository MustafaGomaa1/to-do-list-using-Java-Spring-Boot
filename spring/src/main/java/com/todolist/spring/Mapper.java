package com.todolist.spring;

import com.todolist.spring.Dto.TaskDto;
import com.todolist.spring.model.Task;

public class Mapper {
    public static Task mapToTask(TaskDto dto) {
        return Task.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .startTime(dto.getStartTime())
                .endTime(dto.getEndTime())
                .build();
    }

    public static TaskDto mapToTaskDto(Task dto) {
        return TaskDto.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .startTime(dto.getStartTime())
                .endTime(dto.getEndTime())
                .build();
    }

}
