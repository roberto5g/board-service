package com.robertogs.mytasks.board.integrations;

import com.robertogs.mytasks.board.integrations.dtos.responses.TaskResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "tasks-service",
        url = "${endpoint.task.url}",
        path = "/tasks-service"
)
public interface TaskClient {
    @GetMapping(path = "/api/v1/tasks/{boardId}", produces = MediaType.APPLICATION_JSON_VALUE)
    List<TaskResponse> findTasksByBoardId(@PathVariable("boardId") final Long boarId);
}
