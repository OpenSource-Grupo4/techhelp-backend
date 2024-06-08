package com.upc.sourcebackend.support.domain.model.entities;

import com.upc.sourcebackend.shared.domain.model.entities.AuditableModel;
import com.upc.sourcebackend.support.domain.model.aggregates.Task;
import jakarta.persistence.*;

@Entity
public class TaskRecordItem extends AuditableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="task_id")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "next_task")
    private TaskRecordItem next;
}
