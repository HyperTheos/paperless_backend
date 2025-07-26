package ru.hypertheos.paperless.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hypertheos.paperless.exception.UserNotFoundException;
import ru.hypertheos.paperless.mapper.UserMapper;
import ru.hypertheos.paperless.model.dto.user.UserRequest;
import ru.hypertheos.paperless.model.dto.user.UserResponse;
import ru.hypertheos.paperless.model.entity.user.User;
import ru.hypertheos.paperless.repository.UserRepository;
import ru.hypertheos.paperless.service.UserService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @Override
    public UserResponse getUserById(UUID id) {
        return userMapper.toDto(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

    @Override
    @Transactional
    public UserResponse createUser(UserRequest userRequest) {
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userRequest)));
    }

    @Override
    @Transactional
    public UserResponse updateUser(UUID id, UserRequest userRequest) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        userMapper.updateEntity(userRequest, user);
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    @Transactional
    public void deleteUser(UUID id) {
        userRepository.delete(userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

}
