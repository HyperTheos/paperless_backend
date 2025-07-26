package ru.hypertheos.paperless.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hypertheos.paperless.model.entity.user.Role;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
