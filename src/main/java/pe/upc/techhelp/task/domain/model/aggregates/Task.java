package pe.upc.techhelp.task.domain.model.aggregates;


import jakarta.persistence.Entity;
import lombok.Getter;
import org.apache.logging.log4j.util.Strings;
import pe.upc.techhelp.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import pe.upc.techhelp.task.domain.model.commands.CreateTaskCommand;

@Getter
@Entity
public class Task extends AuditableAbstractAggregateRoot<Task> {
    private String title;
    private String description;
    private Double cost;

    public Task(){
        this.title = Strings.EMPTY;
        this.description = Strings.EMPTY;
        this.cost = 0.0;
    }

    public Task(String title, String description, Double cost){
        this();
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    public Task(CreateTaskCommand command){
        this();
        this.title = command.title();
        this.description = command.description();
        this.cost = command.cost();
    }

    public Task updateTask(String title, String description, Double cost){
        this.title = title;
        this.description = description;
        this.cost = cost;
        return this;
    }
}
