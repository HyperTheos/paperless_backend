package ru.hypertheos.paperless.model.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @NotBlank @Size(min = 3, max = 40)
        String username,

        @Email(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")
        String email,

        @NotBlank @Size(min = 8,  max = 72)
        String password
) {
}
