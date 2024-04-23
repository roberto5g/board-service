package com.robertogs.mytasks.board.rest.mapper;

import com.robertogs.mytasks.board.core.models.Board;
import com.robertogs.mytasks.board.rest.dto.request.BoardRequest;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardMapper {

    BoardMapper INSTANCE = Mappers.getMapper( BoardMapper.class );

    Board toBoard(BoardRequest boardRequest);
    BoardResponse toBoardResponse(Board board);
}
