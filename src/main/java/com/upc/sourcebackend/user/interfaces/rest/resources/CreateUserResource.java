package com.upc.sourcebackend.user.interfaces.rest.resources;

public record CreateUserResource(String firstName,
                                    String lastName,
                                    String email,
                                    String street,
                                    String number,
                                    String city,
                                    String postalCode,
                                    String country) {
}
