package com.robertogs.mytasks.board.core.enums;

import java.util.Arrays;
import java.util.Optional;

public enum StatusTask {
    WAITING(1, "Waiting"),
    TODO(2, "Todo"),
    DOING(3, "Doing"),
    DONE(4, "Done"),
    CANCELED(5, "Canceled");

    private final int id;
    private final String description;

    StatusTask(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static StatusTask getStatusByDescription(String description) {
        Optional<StatusTask> optionalStatus = Arrays.stream(StatusTask.values())
                .filter(status -> status.getDescription().equals(description))
                .findFirst();
        return optionalStatus.orElseThrow(() -> new IllegalArgumentException(description));
    }
}

