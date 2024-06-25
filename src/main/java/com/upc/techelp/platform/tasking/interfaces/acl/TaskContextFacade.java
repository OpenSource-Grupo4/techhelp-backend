package com.upc.techelp.platform.tasking.interfaces.acl;

import com.upc.techelp.platform.tasking.domain.model.queries.GetTaskByIdQuery;
import com.upc.techelp.platform.tasking.domain.services.TaskCommandService;
import com.upc.techelp.platform.tasking.domain.services.TaskQueryService;
import org.springframework.stereotype.Service;

@Service
public class TaskContextFacade {
    private final TaskCommandService taskCommandService;

    private final TaskQueryService taskQueryService;

    public TaskContextFacade (TaskCommandService taskCommandService,
                              TaskQueryService taskQueryService){

        this.taskCommandService=taskCommandService;
        this.taskQueryService=taskQueryService;
    }
    public Long getTaskById(Long taskId){
        var command = new GetTaskByIdQuery(taskId);
        var task = this.taskQueryService.handle(command);
        if (task.isEmpty()) return 0L;
        return task.get().getId();
    }


}
