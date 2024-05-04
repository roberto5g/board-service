package com.robertogs.mytasks.board.exceptions;


public class TaskServiceClientNotFoundException extends TaskClientException {
    public TaskServiceClientNotFoundException(Integer code, String message) {
        super(code, message);
    }
}
