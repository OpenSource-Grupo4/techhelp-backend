package com.upc.sourcebackend.user.domain.model.valueObjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public record PersonName(@NotBlank String firstName, @NotBlank String lastName) {
    public PersonName(){this(null,null);}

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
