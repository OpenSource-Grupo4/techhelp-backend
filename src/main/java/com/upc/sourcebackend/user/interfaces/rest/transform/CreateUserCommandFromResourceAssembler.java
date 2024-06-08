package com.upc.sourcebackend.user.interfaces.rest.transform;

import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import com.upc.sourcebackend.user.interfaces.rest.resources.CreateUserResource;

public class CreateUserCommandFromResourceAssembler {
    public static CreateProfileCommand toCommandFromResource(CreateUserResource resource) {
        return new CreateProfileCommand(
                resource.firstName(),
                resource.lastName(),
                resource.email(),
                resource.street(),
                resource.number(),
                resource.city(),
                resource.postalCode(),
                resource.country()
        );
    }
}
