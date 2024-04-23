package com.robertogs.mytasks.board.core.usecase;

import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import com.robertogs.mytasks.board.core.models.Board;
import org.springframework.stereotype.Component;


public class InsertBoardUseCase implements InsertBoardInputPort {

    private final InsertBoardOutputPort insertBoardOutputPort;

    public InsertBoardUseCase(InsertBoardOutputPort insertBoardOutputPort) {
        this.insertBoardOutputPort = insertBoardOutputPort;
    }

    @Override
    public Board insert(Board board) {
        return insertBoardOutputPort.insert(board);
    }
}
