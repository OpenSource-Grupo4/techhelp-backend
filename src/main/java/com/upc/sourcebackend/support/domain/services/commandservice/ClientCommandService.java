package com.upc.sourcebackend.support.domain.services.commandservice;

import com.upc.sourcebackend.support.domain.model.commands.CreateClientCommand;
import com.upc.sourcebackend.support.domain.model.valueObjects.ClientId;

public interface ClientCommandService {
    ClientId handle(CreateClientCommand command);
}
