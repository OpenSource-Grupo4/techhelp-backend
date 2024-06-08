package com.upc.sourcebackend.support.domain.services.commandservice;

import com.upc.sourcebackend.support.domain.model.commands.CreateCellPhoneCommand;
import com.upc.sourcebackend.support.domain.model.valueObjects.CellPhoneId;

public interface CellphoneCommandService {

    CellPhoneId handle(CreateCellPhoneCommand command);
}
