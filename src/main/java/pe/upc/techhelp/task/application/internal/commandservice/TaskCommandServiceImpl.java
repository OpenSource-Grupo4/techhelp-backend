package pe.upc.techhelp.task.application.internal.commandservice;


import org.springframework.stereotype.Service;
import pe.upc.techhelp.task.domain.model.aggregates.Task;
import pe.upc.techhelp.task.domain.model.commands.CreateTaskCommand;
import pe.upc.techhelp.task.domain.model.commands.DeleteTaskCommand;
import pe.upc.techhelp.task.domain.model.commands.UpdateTaskCommand;
import pe.upc.techhelp.task.domain.services.TaskCommandService;
import pe.upc.techhelp.task.infrastructure.persistence.jpa.repositories.TaskRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class TaskCommandServiceImpl implements TaskCommandService {
    private final TaskRepository taskRepository;

    public TaskCommandServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Long handle(CreateTaskCommand command){
        var task = new Task(command);
        try {
            taskRepository.save(task);
        }catch(Exception error){
            throw new IllegalArgumentException("Bad Request Exception" + error.getMessage());
        }
        return task.getId();
    }

    @Override
    public Optional<Task> handle(UpdateTaskCommand command){
        var tasks = taskRepository.findTaskById(command.id());
        if(tasks.isEmpty()) throw new IllegalArgumentException("Task already exists");
        var result = tasks.get();
        try {
            var updatedTask = taskRepository.save(result.updateTask(command.title(),command.description(),command.cost()));
            return Optional.of(updatedTask);
        }catch(Exception error){
            throw new IllegalArgumentException("Bad Request Exception" + error.getMessage());
        }
    }

    @Override
    public void handle(DeleteTaskCommand command){
        if(!taskRepository.existsById(command.taskId())){
            throw new IllegalArgumentException("Task does not exists");
        }
        try {
            taskRepository.deleteById(command.taskId());
        }catch (Exception error) {
            throw new IllegalArgumentException("Bad Request Exception" + error.getMessage());
        }
    }
}
