package com.upc.techelp.platform.subscription.interfaces.rest.transform;

import com.upc.techelp.platform.subscription.domain.model.entities.Membership;
import com.upc.techelp.platform.subscription.interfaces.rest.resources.MembershipResource;

public class MembershipResourceFromEntityAssembler {

    public static MembershipResource toResourceFromEntity(Membership entity) {
        return new MembershipResource(entity.getId(), entity.getTitle(), entity.getDescription(), entity.getType(),entity.getCost());
    }
}
