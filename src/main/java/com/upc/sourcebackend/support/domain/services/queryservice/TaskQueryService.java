package com.upc.sourcebackend.support.domain.services.queryservice;

import com.upc.sourcebackend.support.domain.model.aggregates.Task;
import com.upc.sourcebackend.support.domain.model.queries.GetTaskByTechnicianId;

import java.util.Optional;

public interface TaskQueryService {
    Optional<Task> handle(GetTaskByTechnicianId id);
}
