package com.robertogs.mytasks.board.ports.out;

import com.robertogs.mytasks.board.core.models.Board;

public interface FindBoardByIdOutputPort {
    Board findById(final Long boardId);
}
