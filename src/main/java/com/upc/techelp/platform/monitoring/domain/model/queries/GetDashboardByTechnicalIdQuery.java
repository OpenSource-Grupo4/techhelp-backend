package com.upc.techelp.platform.monitoring.domain.model.queries;

import com.upc.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;

public record GetDashboardByTechnicalIdQuery(TechnicianId technicianId) {
}
