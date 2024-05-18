package com.robertogs.mytasks.board.rest.dto.request;

import com.robertogs.mytasks.board.core.exceptions.errors.Errors;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequest {
    @NotEmpty
    @Size(max = 100, message = Errors.TITLE_MAX_SIZE)
    private String title;
    @NotEmpty
    private String description;
}
