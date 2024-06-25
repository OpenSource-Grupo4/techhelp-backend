package com.upc.techelp.platform.iam.interfaces.rest.transform;

import com.upc.techelp.platform.iam.domain.model.aggregates.User;
import com.upc.techelp.platform.iam.interfaces.rest.resources.AuthenticatedUserResource;
public class AuthenticatedUserResourceFromEntityAssembler {
    public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedUserResource(user.getId(), user.getUsername(), token, (user.getRoles().iterator().next().getName()).toString());
    }
}
