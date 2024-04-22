package com.robertogs.mytasks.board.core.usecase;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.in.FindBoardByIdInputPort;
import com.robertogs.mytasks.board.ports.out.FindBoardByIdOutputPort;
import com.robertogs.mytasks.board.ports.out.integrations.FindTasksByBoardIdOutputPort;


public class FindBoardByIdUseCase implements FindBoardByIdInputPort {

    private final FindBoardByIdOutputPort findBoardByIdOutputPort;
    private final FindTasksByBoardIdOutputPort findTasksByBoardIdOutputPort;

    public FindBoardByIdUseCase(FindBoardByIdOutputPort findBoardByIdOutputPort, FindTasksByBoardIdOutputPort findTasksByBoardIdOutputPort) {
        this.findBoardByIdOutputPort = findBoardByIdOutputPort;
        this.findTasksByBoardIdOutputPort = findTasksByBoardIdOutputPort;
    }

    @Override
    public Board findById(final Long boardId) {
        var board = findBoardByIdOutputPort.findById(boardId);
        var tasks = findTasksByBoardIdOutputPort.findByBoardId(board.getId());
        board.setTasks(tasks);
        return board;
    }
}
