package com.robertogs.mytasks.board.mapper;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.persistence.entity.BoardEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Optional;

@Mapper
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper( BoardMapper.class );

    BoardEntity toBoardEntity(Board board);
    Board toBoard(BoardEntity boardEntity);
    default Board toBoard(Optional<BoardEntity> optionalEntity) {
        return optionalEntity.map(this::toBoard).orElse(null);
    }
}
