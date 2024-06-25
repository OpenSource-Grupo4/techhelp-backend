package com.upc.techelp.platform.tasking.domain.services;


import com.upc.techelp.platform.tasking.domain.model.entities.Task;
import com.upc.techelp.platform.tasking.domain.model.queries.GetTaskByIdQuery;
import com.upc.techelp.platform.tasking.domain.model.queries.GetTaskByTechnicalIdQuery;


import java.util.List;
import java.util.Optional;

public interface TaskQueryService {

    Optional<Task> handle(GetTaskByIdQuery query);
    List<Task> handle();
    List<Task> handle(GetTaskByTechnicalIdQuery query);
}
