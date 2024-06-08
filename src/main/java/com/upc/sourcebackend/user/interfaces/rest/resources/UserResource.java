package com.upc.sourcebackend.user.interfaces.rest.resources;

public record UserResource(Long id, String fullName, String emailAddress, String streetAddress) {
}
