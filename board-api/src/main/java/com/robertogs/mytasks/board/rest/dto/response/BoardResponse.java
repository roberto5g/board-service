package com.robertogs.mytasks.board.rest.dto.response;

import com.robertogs.mytasks.board.core.models.Task;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BoardResponse {
    private Long id;
    private String title;
    private String description;
    private List<Task> tasks;
}
