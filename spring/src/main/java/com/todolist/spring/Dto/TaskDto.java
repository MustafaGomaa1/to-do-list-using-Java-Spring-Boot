package com.todolist.spring.Dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {
    private Long id;
    @NotEmpty(message = "Shouldn't Be Empty!")
    private String title;
    @NotEmpty(message = "Shouldn't Be Empty!")
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
