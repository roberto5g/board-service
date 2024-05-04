package com.robertogs.mytasks.board.integrations.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
}
