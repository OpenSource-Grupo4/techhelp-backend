package com.upc.techelp.platform.monitoring.interfaces.rest.resources;

import java.util.List;

public record CreateInventoryResource(
        Long technicalId,
        List<CreateComponentResource> items
) {
}
