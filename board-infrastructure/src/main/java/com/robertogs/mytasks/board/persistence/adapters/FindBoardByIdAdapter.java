package com.robertogs.mytasks.board.persistence.adapters;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.mapper.BoardMapper;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import com.robertogs.mytasks.board.persistence.repositories.BoardJpaRepository;
import com.robertogs.mytasks.board.ports.out.FindBoardByIdOutputPort;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Primary
@RequiredArgsConstructor
public class FindBoardByIdAdapter implements FindBoardByIdOutputPort {

    private final BoardJpaRepository boardRepository;

    @Override
    public Board findById(final Long boardId) {
        return BoardMapper.INSTANCE.toBoard(boardRepository.findById(boardId));
    }
}
