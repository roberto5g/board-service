package com.robertogs.mytasks.board.ports.in;

import com.robertogs.mytasks.board.core.models.Board;

public interface FindBoardByIdInputPort {
    Board findById(final Long boardId);
}
