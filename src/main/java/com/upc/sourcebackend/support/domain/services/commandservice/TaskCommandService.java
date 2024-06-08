package com.upc.sourcebackend.support.domain.services.commandservice;

import com.upc.sourcebackend.support.domain.model.commands.CreateTaskCommand;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskId;

public interface TaskCommandService {
    TaskId handle(CreateTaskCommand command);
}
