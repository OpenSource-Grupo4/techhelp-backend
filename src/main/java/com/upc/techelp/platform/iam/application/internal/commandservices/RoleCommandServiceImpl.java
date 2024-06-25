package com.upc.techelp.platform.iam.application.internal.commandservices;

import com.upc.techelp.platform.iam.domain.model.commands.SeedRolesCommand;
import com.upc.techelp.platform.iam.domain.model.entities.Role;
import com.upc.techelp.platform.iam.domain.model.valueobjects.Roles;
import com.upc.techelp.platform.iam.domain.services.RoleCommandService;
import com.upc.techelp.platform.iam.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;


import java.util.Arrays;

/**
 * Implementation of {@link RoleCommandService}
 */
@Service
public class RoleCommandServiceImpl implements RoleCommandService {
    private final RoleRepository roleRepository;

    public RoleCommandServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void handle(SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(role -> {
            if (!roleRepository.existsByName(role))
                roleRepository.save(new Role(Roles.valueOf(role.name())));
        });
    }
}
