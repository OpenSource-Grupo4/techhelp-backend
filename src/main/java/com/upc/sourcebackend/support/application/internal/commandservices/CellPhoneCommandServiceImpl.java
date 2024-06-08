package com.upc.sourcebackend.support.application.internal.commandservices;

import com.upc.sourcebackend.support.domain.model.aggregates.CellPhone;
import com.upc.sourcebackend.support.domain.model.commands.CreateCellPhoneCommand;
import com.upc.sourcebackend.support.domain.model.queries.GetCellPhoneById;
import com.upc.sourcebackend.support.domain.model.valueObjects.CellPhoneId;
import com.upc.sourcebackend.support.domain.services.commandservice.CellphoneCommandService;
import com.upc.sourcebackend.support.infrastructure.persistence.jpa.repositories.CellPhoneRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
////public class CellPhoneCommandServiceImpl implements CellphoneCommandService {
////    private final CellPhoneRepository cellPhoneRepository;
////
////    public CellPhoneCommandServiceImpl(CellPhoneRepository cellPhoneRepository){
////        this.cellPhoneRepository = cellPhoneRepository;
////    }
////
////    @Override
////    public Long
////
////}
