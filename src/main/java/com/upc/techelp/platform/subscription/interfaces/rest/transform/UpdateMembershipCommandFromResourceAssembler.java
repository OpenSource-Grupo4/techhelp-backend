package com.upc.techelp.platform.subscription.interfaces.rest.transform;

import com.upc.techelp.platform.subscription.domain.model.commands.UpdateMembershipCommand;
import com.upc.techelp.platform.subscription.interfaces.rest.resources.UpdateMembershipResource;

public class UpdateMembershipCommandFromResourceAssembler {

    public static UpdateMembershipCommand toCommandFromResource(Long membershipId, UpdateMembershipResource resource){
        return new UpdateMembershipCommand(membershipId, resource.title(), resource.description(),resource.type(),resource.cost());
    }
}
