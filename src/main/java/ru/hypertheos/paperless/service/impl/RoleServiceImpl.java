package ru.hypertheos.paperless.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hypertheos.paperless.model.entity.user.Role;
import ru.hypertheos.paperless.repository.RoleRepository;
import ru.hypertheos.paperless.service.RoleService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role createRole() {
        return null;
    }

    @Override
    public Role updateRole(UUID id, Role role) {
        return null;
    }

    @Override
    public void deleteRole(UUID id) {

    }
}
