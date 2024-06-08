package com.upc.sourcebackend.support.domain.services.queryservice;

import com.upc.sourcebackend.support.domain.model.aggregates.CellPhone;
import com.upc.sourcebackend.support.domain.model.queries.GetCellPhoneById;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CellPhoneQueryService {
    Optional<CellPhone> handle(GetCellPhoneById id);
}
