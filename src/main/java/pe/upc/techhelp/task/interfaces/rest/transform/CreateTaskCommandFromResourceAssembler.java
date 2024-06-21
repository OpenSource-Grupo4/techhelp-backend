package pe.upc.techhelp.task.interfaces.rest.transform;

import pe.upc.techhelp.task.domain.model.commands.CreateTaskCommand;
import pe.upc.techhelp.task.interfaces.rest.resources.CreateTaskResource;

public class CreateTaskCommandFromResourceAssembler {
    public static CreateTaskCommand toCommandFromResource(CreateTaskResource resource){
        return new CreateTaskCommand(resource.title(), resource.description(), resource.cost());
    }
}
