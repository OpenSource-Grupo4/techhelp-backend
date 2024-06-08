package com.upc.sourcebackend.user.domain.model.valueObjects;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public record UserAddress(
        @NotBlank String street,
        @NotBlank String number,
        @NotBlank String city,
        @NotBlank String postalCode,
        @NotBlank String country
) {
    public UserAddress(){
        this(null,null,null,null,null);
    }

    public String getStreetAddress() {
        return String.format("%s %s, %s, %s, %s", street, number, city, postalCode, country);
    }
}
