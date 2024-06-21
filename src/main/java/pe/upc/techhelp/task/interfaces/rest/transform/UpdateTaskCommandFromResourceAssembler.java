package pe.upc.techhelp.task.interfaces.rest.transform;

import pe.upc.techhelp.task.domain.model.commands.UpdateTaskCommand;
import pe.upc.techhelp.task.interfaces.rest.resources.UpdateTaskResource;

public class UpdateTaskCommandFromResourceAssembler {
    public static UpdateTaskCommand toCommandFromResource(Long id, UpdateTaskResource resource){
        return new UpdateTaskCommand(id, resource.title(),resource.description(),resource.cost());
    }
}
