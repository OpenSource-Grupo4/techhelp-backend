package com.upc.techelp.platform.monitoring.domain.services;

import com.upc.techelp.platform.monitoring.domain.model.commands.SubscribeTechnicianToDashBoardCommand;

public interface DashboardCommandService {
    Long handle(SubscribeTechnicianToDashBoardCommand command);
}
