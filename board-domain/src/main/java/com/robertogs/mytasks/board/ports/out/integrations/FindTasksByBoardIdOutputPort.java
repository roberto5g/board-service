package com.robertogs.mytasks.board.ports.out.integrations;

import com.robertogs.mytasks.board.core.models.Task;

import java.util.List;

public interface FindTasksByBoardIdOutputPort {
    List<Task> findByBoardId(final Long id);
}
