package com.robertogs.mytasks.board.ports.out;

import com.robertogs.mytasks.board.core.models.Board;

import java.util.Optional;

public interface InsertBoardOutputPort {
    Board insert(Board board);
}
