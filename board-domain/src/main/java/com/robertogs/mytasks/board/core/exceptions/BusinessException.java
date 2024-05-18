package com.robertogs.mytasks.board.core.exceptions;

import com.robertogs.mytasks.board.core.enums.ErrorCodeEnum;
import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException {
    private static final long serialVersion = 1L;
    private final ErrorCodeEnum errorCode;
    private final HttpStatus status;

    protected BusinessException(HttpStatus status, ErrorCodeEnum errorCode) {
        this.errorCode = errorCode;
        this.status = status;
    }

    public ErrorCodeEnum getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
