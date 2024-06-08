package com.upc.sourcebackend.support.domain.services.queryservice;

import com.upc.sourcebackend.support.domain.model.aggregates.Technician;
import com.upc.sourcebackend.support.domain.model.queries.GetTechnicianById;

import java.util.Optional;

public interface TechnicianQueryService {
    Optional<Technician> handle(GetTechnicianById query);
}
