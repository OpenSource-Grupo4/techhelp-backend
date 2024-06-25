package com.upc.techelp.platform.subscription.interfaces.rest.resources;

public record CreateMembershipResource(String title, String description, Integer type, Long cost) {
}
