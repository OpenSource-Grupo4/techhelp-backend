package com.upc.techelp.platform.tasking.domain.services;

import com.upc.techelp.platform.tasking.domain.model.commands.CreateTaskCommand;
public interface TaskCommandService {
    Long handle(CreateTaskCommand command);
}
