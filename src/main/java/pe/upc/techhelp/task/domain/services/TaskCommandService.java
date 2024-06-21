package pe.upc.techhelp.task.domain.services;

import pe.upc.techhelp.task.domain.model.aggregates.Task;
import pe.upc.techhelp.task.domain.model.commands.CreateTaskCommand;
import pe.upc.techhelp.task.domain.model.commands.DeleteTaskCommand;
import pe.upc.techhelp.task.domain.model.commands.UpdateTaskCommand;

import java.util.Optional;

public interface TaskCommandService {
    Long handle(CreateTaskCommand command);
    Optional<Task> handle(UpdateTaskCommand command);

    void handle(DeleteTaskCommand command);
}
