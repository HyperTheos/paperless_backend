package ru.hypertheos.paperless.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.hypertheos.paperless.model.dto.user.UserRequest;
import ru.hypertheos.paperless.model.dto.user.UserResponse;
import ru.hypertheos.paperless.model.entity.user.User;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

    public UserResponse toDto(User user) {
        return new UserResponse(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }

    public User toEntity(UserRequest userRequest) {
        return User.builder()
                .username(userRequest.username())
                .email(userRequest.email())
                .password(passwordEncoder.encode(userRequest.password()))
                .build();
    }

    public void updateEntity(UserRequest userRequest, User user) {
        user.setUsername(userRequest.username());
        user.setEmail(userRequest.email());
        user.setPassword(passwordEncoder.encode(userRequest.password()));
    }
}
