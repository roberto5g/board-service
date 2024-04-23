package com.robertogs.mytasks.board.integrations.dtos.responses;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.core.models.Comment;
import com.robertogs.mytasks.board.core.models.User;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private String status;
    private Date dueDate;
    private User author;
    private User assignee;
    private Board board;
    private List<Comment> comments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
