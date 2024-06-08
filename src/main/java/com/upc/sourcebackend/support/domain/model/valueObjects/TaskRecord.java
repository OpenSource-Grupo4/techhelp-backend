package com.upc.sourcebackend.support.domain.model.valueObjects;

import com.upc.sourcebackend.support.domain.model.entities.TaskRecordItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class TaskRecord {
    @OneToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<TaskRecordItem> taskRecordItems;
}
