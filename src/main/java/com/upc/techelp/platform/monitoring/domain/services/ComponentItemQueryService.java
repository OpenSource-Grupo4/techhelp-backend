package com.upc.techelp.platform.monitoring.domain.services;

import com.upc.techelp.platform.monitoring.domain.model.entities.ComponentItem;
import com.upc.techelp.platform.monitoring.domain.model.queries.GetComponentByDashBoardIdQuery;

import java.util.List;

public interface ComponentItemQueryService {
    List<ComponentItem> handle(GetComponentByDashBoardIdQuery query);
}
