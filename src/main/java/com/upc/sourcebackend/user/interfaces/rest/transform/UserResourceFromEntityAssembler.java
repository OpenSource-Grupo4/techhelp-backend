package com.upc.sourcebackend.user.interfaces.rest.transform;

import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource transformResourceFromEntity(User entity){
        return new UserResource(entity.getId(), entity.getFullName(), entity.getEmailAddress(), entity.getStreetAddress());
    }
}
