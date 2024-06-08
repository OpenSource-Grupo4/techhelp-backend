package com.upc.sourcebackend.support.domain.services.queryservice;

import com.upc.sourcebackend.support.domain.model.aggregates.Client;
import com.upc.sourcebackend.support.domain.model.queries.GetClientById;

import java.util.Optional;

public interface ClientQueryService {
    Optional<Client> handle(GetClientById id);
}
