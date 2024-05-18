package com.robertogs.mytasks.board.integrations.adapters;

import com.robertogs.mytasks.board.core.exceptions.TaskServiceIntegrationException;
import com.robertogs.mytasks.board.core.models.Task;
import com.robertogs.mytasks.board.integrations.TaskClient;
import com.robertogs.mytasks.board.mapper.TaskMapper;
import com.robertogs.mytasks.board.ports.out.integrations.FindTasksByBoardIdOutputPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TaskClientAdapter implements FindTasksByBoardIdOutputPort {

    private final TaskClient taskClient;

    @Override
    public List<Task> findByBoardId(final Long boardId) {
        try{
            log.info("trying get list of tasks");
            var taskResponse = taskClient.findTasksByBoardId(boardId);
            log.info("returning list of tasks");
            return TaskMapper.INSTANCE.toTasks(taskResponse);
        } catch (Exception ex){
            log.error("Error in integration with TaskService");
            throw new TaskServiceIntegrationException();
        }
    }

}
