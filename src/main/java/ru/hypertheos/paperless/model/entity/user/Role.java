package ru.hypertheos.paperless.model.entity.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import ru.hypertheos.paperless.enums.UserRole;

import java.time.Instant;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pl_roles")
@EntityListeners(AuditingEntityListener.class)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private UserRole code;

    @NotBlank
    @Size(min = 5, max = 20)
    private String name;

    @NotBlank
    @Size(min = 5, max = 20)
    private String description;

    @CreatedDate
    @Column(name = "created_at",  nullable = false, updatable = false)
    private Instant createdAt;
}
