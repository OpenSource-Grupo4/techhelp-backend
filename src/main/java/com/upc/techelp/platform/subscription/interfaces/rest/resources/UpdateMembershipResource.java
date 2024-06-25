package com.upc.techelp.platform.subscription.interfaces.rest.resources;

public record UpdateMembershipResource(String title, String description, Integer type, Long cost) {
}
