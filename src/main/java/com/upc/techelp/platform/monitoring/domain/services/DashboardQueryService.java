package com.upc.techelp.platform.monitoring.domain.services;

import com.upc.techelp.platform.monitoring.domain.model.entities.DashBoard;
import com.upc.techelp.platform.monitoring.domain.model.queries.GetDashboardByTechnicalIdQuery;

import java.util.Optional;

public interface DashboardQueryService {
    Optional<DashBoard> handle(GetDashboardByTechnicalIdQuery query);
}
