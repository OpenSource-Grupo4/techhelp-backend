package com.upc.techelp.platform.iam.interfaces.rest.transform;

import com.upc.techelp.platform.iam.domain.model.commands.SignUpCommand;
import com.upc.techelp.platform.iam.interfaces.rest.resources.SignUpResource;
import com.upc.techelp.platform.iam.domain.model.entities.Role;
import java.util.ArrayList;

public class SignUpCommandFromResourceAssembler {
    public static SignUpCommand toCommandFromResource(SignUpResource signUpResource) {
        var roles = signUpResource.roles() != null ? signUpResource.roles().stream()
                .map(name -> Role.toRoleFromName(name))
                .toList() : new ArrayList<Role>();
        return new SignUpCommand(signUpResource.username(), signUpResource.password(), roles);
    }
}
