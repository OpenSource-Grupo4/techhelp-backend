package pe.upc.techhelp.task.interfaces.rest.transform;

import pe.upc.techhelp.task.domain.model.aggregates.Task;
import pe.upc.techhelp.task.interfaces.rest.resources.TaskResource;

public class TaskResourceFromEntityAssembler {
    public static TaskResource toResourceFromEntity(Task entity){
        return new TaskResource(entity.getId(), entity.getTitle(), entity.getDescription(), entity.getCost());
    }
}
