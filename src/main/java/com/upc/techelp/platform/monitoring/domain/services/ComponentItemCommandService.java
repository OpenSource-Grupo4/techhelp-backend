package com.upc.techelp.platform.monitoring.domain.services;

import com.upc.techelp.platform.monitoring.domain.model.commands.CreateComponentItemCommand;
import com.upc.techelp.platform.monitoring.domain.model.commands.UpdateComponentItemCommand;

public interface ComponentItemCommandService {
    Long handle(CreateComponentItemCommand command);

    void handle(UpdateComponentItemCommand command);
}
