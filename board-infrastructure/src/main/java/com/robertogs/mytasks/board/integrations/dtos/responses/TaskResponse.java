package com.robertogs.mytasks.board.integrations.dtos.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Date dueDate;
    private UserResponseDTO author;
    private UserResponseDTO assignee;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
