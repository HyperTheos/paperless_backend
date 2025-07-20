package ru.hypertheos.paperless.model.dto;

import java.time.Instant;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        String username,
        Instant createdAt,
        Instant updatedAt
) {
}
