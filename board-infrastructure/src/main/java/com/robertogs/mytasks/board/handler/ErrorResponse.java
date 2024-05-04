package com.robertogs.mytasks.board.handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {
    private Integer statusCode;
    private String message;
    private String timestamp;
}
