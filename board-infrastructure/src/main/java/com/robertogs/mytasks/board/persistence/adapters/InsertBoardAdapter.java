package com.robertogs.mytasks.board.persistence.adapters;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.ports.out.InsertBoardOutputPort;
import com.robertogs.mytasks.board.mapper.BoardMapper;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import com.robertogs.mytasks.board.persistence.repositories.BoardJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Primary
@RequiredArgsConstructor
public class InsertBoardAdapter implements InsertBoardOutputPort {

    private final BoardJpaRepository boardRepository;

    @Override
    public Board insert(final Board board) {
        BoardEntity boardEntity = BoardMapper.INSTANCE.toBoardEntity(board);
        boardEntity.setCreatedAt(LocalDateTime.now());
        return BoardMapper.INSTANCE.toBoard(boardRepository.save(boardEntity));
    }

}
