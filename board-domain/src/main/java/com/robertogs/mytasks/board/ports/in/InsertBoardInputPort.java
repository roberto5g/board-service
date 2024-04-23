package com.robertogs.mytasks.board.ports.in;

import com.robertogs.mytasks.board.core.models.Board;

public interface InsertBoardInputPort {
    Board insert(final Board board);
}
