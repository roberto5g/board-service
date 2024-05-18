package com.robertogs.mytasks.board.core.exceptions;


import com.robertogs.mytasks.board.core.enums.ErrorCodeEnum;
import org.springframework.http.HttpStatus;

public class TaskServiceIntegrationException extends BusinessException {
    public TaskServiceIntegrationException() {
        super(HttpStatus.UNPROCESSABLE_ENTITY, ErrorCodeEnum.BS422001);
    }
}
