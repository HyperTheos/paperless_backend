package ru.hypertheos.paperless.exception;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(UUID id) {
        super("User with {id} not found" + id);
    }
}
