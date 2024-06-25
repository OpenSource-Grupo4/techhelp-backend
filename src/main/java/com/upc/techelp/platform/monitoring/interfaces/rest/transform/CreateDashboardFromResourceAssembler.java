package com.upc.techelp.platform.monitoring.interfaces.rest.transform;

import com.upc.techelp.platform.monitoring.domain.model.commands.SubscribeTechnicianToDashBoardCommand;
import com.upc.techelp.platform.monitoring.domain.model.valueobjects.TechnicianId;
import com.upc.techelp.platform.monitoring.interfaces.rest.resources.CreateDashboardResource;

public class CreateDashboardFromResourceAssembler {
    public static SubscribeTechnicianToDashBoardCommand toCommandFrom(CreateDashboardResource resource){
        return new SubscribeTechnicianToDashBoardCommand(new TechnicianId(resource.technicalId()));
    }
}
