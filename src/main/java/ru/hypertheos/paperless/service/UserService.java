package ru.hypertheos.paperless.service;

import ru.hypertheos.paperless.model.dto.user.UserRequest;
import ru.hypertheos.paperless.model.dto.user.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserResponse> getAllUsers();
    UserResponse getUserById(UUID id);
    UserResponse createUser(UserRequest userRequest);
    UserResponse updateUser(UUID id, UserRequest userRequest);
    void deleteUser(UUID id);
}
