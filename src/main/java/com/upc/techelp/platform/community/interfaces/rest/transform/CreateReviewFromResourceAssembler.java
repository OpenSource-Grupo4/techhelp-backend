package com.upc.techelp.platform.community.interfaces.rest.transform;

import com.upc.techelp.platform.community.domain.model.commands.CreateReviewCommand;
import com.upc.techelp.platform.community.interfaces.rest.resources.CreateReviewResource;

public class CreateReviewFromResourceAssembler {
    public static CreateReviewCommand toCommandFrom(CreateReviewResource resource){
        return new CreateReviewCommand(resource.comment(),resource.assessment(),resource.technicalId());
    }
}
