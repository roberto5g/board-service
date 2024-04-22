package com.robertogs.mytasks.board.rest.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardRequest {
    private String title;
    private String description;
}
