package com.upc.techelp.platform.monitoring.interfaces.rest.transform;

import com.upc.techelp.platform.monitoring.domain.model.entities.DashBoard;
import com.upc.techelp.platform.monitoring.interfaces.rest.resources.DashboardResource;

public class DashboardResourceFromEntityAssembler {
    public static DashboardResource toResourceFromEntity(DashBoard entity){
        return new DashboardResource(entity.getId(),null);
    }
}
