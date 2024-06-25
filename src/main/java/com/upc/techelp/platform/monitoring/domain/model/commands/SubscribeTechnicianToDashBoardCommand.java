package com.upc.techelp.platform.monitoring.domain.model.commands;

import com.upc.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;

public record SubscribeTechnicianToDashBoardCommand(TechnicianId technicianId) {
}
