package com.upc.techelp.platform.repairing.interfaces.rest.transform;

import com.upc.techelp.platform.repairing.domain.model.commands.CreateTechnicalCommand;
import com.upc.techelp.platform.repairing.interfaces.rest.resources.CreateTechnicalResource;

public class CreateTechnicalFromResourceAssembler {
    public static CreateTechnicalCommand toCommandFrom(CreateTechnicalResource resource){
        return new CreateTechnicalCommand(resource.name(),resource.lastName(),resource.phone(),resource.address(),
                resource.city(),resource.experience(), resource.photo(),resource.email(),resource.password(),resource.description());
    }
}
