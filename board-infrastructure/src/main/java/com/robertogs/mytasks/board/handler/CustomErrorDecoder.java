package com.robertogs.mytasks.board.handler;

import com.robertogs.mytasks.board.exceptions.TaskClientException;
import com.robertogs.mytasks.board.exceptions.TaskServiceClientNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        log.info("Error decoder: {} {}", methodKey, response);
        if(response.status() == 404){
            throw new TaskServiceClientNotFoundException(response.status(), "TaskService not found");
        }
        return new TaskClientException(500, "ERROR");
    }
}
