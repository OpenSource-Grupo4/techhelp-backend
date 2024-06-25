package com.upc.techelp.platform.monitoring.interfaces.rest.resources;

public record ComponentResource(
        Long id,
        String name,
        Long quantity,
        double price
) {
}
