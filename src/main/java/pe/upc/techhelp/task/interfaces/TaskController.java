package pe.upc.techhelp.task.interfaces;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.upc.techhelp.task.domain.services.TaskCommandService;
import pe.upc.techhelp.task.domain.services.TaskQueryService;

@RestController
@RequestMapping(value = "api/v1/tasks")
@Tag(name="Tasks", description = "Task Management Endpoints")
public class TaskController {

    private final TaskCommandService taskCommandService;
    private final TaskQueryService taskQueryService;

    public TaskController(TaskCommandService taskCommandService, TaskQueryService taskQueryService){
        this.taskCommandService = taskCommandService;
        this.taskQueryService = taskQueryService;
    }

}
