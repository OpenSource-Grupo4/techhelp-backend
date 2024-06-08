package com.upc.sourcebackend.user.domain.model.valueObjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public record EmailAddress(@Email String emailAddress) {
    public EmailAddress(){this(null);}
}
