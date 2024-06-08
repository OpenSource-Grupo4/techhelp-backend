package com.upc.sourcebackend.support.domain.model.aggregates;

import com.upc.sourcebackend.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskId;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskRecord;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Task extends AuditableAbstractAggregateRoot<Task> {
    private String description;
    private String estimated;

    @Embedded
    @Column(name = "task_id")
    private final TaskId taskId;

    public Task(){
        this.taskId = new TaskId();
    }
}
