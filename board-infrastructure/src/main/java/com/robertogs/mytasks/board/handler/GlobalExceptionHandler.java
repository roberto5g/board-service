package com.robertogs.mytasks.board.handler;

import com.robertogs.mytasks.board.exceptions.TaskServiceClientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@RestControllerAdvice
public class GlobalExceptionHandler {

    final String ERROR_TASK_UNEXPECTED = "An unexpected error occurred while fetching task. " +
            "The server encountered an unexpected end of stream during communication.";

    @ExceptionHandler(TaskServiceClientNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTaskServiceNotFoundException(TaskServiceClientNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(getErrorObject(ex.getMessage(), HttpStatus.NOT_FOUND.value()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(getErrorObject(ERROR_TASK_UNEXPECTED, HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    private static ErrorResponse getErrorObject(String message, int statusCode) {
        return ErrorResponse.builder()
                .statusCode(statusCode)
                .message(message)
                .timestamp(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss", Locale.ENGLISH)
                .format(LocalDateTime.now()))
                .build();
    }
}
