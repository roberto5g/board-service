package com.robertogs.mytasks.board.rest.controller;

import com.robertogs.mytasks.board.ports.in.FindBoardByIdInputPort;
import com.robertogs.mytasks.board.ports.in.InsertBoardInputPort;
import com.robertogs.mytasks.board.rest.dto.request.BoardRequest;
import com.robertogs.mytasks.board.rest.dto.response.BoardResponse;
import com.robertogs.mytasks.board.rest.mapper.BoardMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

    private final InsertBoardInputPort insertBoardInputPort;
    private final FindBoardByIdInputPort findBoardByIdInputPort;

    @GetMapping("/{boardId}")
    public ResponseEntity<BoardResponse> getBoardById(@PathVariable("boardId") final Long id){
        final var board = findBoardByIdInputPort.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(BoardMapper.INSTANCE.toBoardResponse(board));
    }

    @PostMapping
    public ResponseEntity<BoardResponse> create(@Valid @RequestBody final BoardRequest boardRequest){
        var board = insertBoardInputPort.insert(BoardMapper.INSTANCE.toBoard(boardRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(BoardMapper.INSTANCE.toBoardResponse(board));
    }

}
