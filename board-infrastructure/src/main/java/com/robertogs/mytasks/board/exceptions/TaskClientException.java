package com.robertogs.mytasks.board.exceptions;


public class TaskClientException extends RuntimeException {

    private final Integer code;
    private final String message;

    public TaskClientException(final Integer code, final String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

}
