package ru.hypertheos.paperless.service;

import ru.hypertheos.paperless.model.entity.user.Role;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    List<Role> getAllRoles();
    Role createRole();
    Role updateRole(UUID id, Role role);
    void deleteRole(UUID id);
}
