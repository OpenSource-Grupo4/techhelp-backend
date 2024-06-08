package com.upc.sourcebackend.support.domain.services.commandservice;

import com.upc.sourcebackend.support.domain.model.commands.CreateTechnicianCommand;
import com.upc.sourcebackend.support.domain.model.valueObjects.TechnicianId;

public interface TechnicianCommandService {
    TechnicianId handle(CreateTechnicianCommand command);
}
