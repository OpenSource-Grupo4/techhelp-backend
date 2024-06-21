package pe.upc.techhelp.task.domain.services;

import pe.upc.techhelp.task.domain.model.aggregates.Task;
import pe.upc.techhelp.task.domain.model.queries.GetAllTasksQuery;
import pe.upc.techhelp.task.domain.model.queries.GetTaskByIdQuery;

import java.util.List;
import java.util.Optional;

public interface TaskQueryService {
    Optional<Task> handle(GetTaskByIdQuery query);
    List<Task> handle(GetAllTasksQuery query);
}
