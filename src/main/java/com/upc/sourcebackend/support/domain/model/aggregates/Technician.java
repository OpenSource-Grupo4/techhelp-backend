package com.upc.sourcebackend.support.domain.model.aggregates;

import com.upc.sourcebackend.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskRecord;
import com.upc.sourcebackend.support.domain.model.valueObjects.TechnicianId;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Technician extends AuditableAbstractAggregateRoot<Technician> {
    @Embedded
    @Column(name="technician_id")
    private final TechnicianId technicianId;

    @Embedded
    private final TaskRecord record;

    public Technician(){
        this.technicianId = new TechnicianId();
        this.record = new TaskRecord();
    }
}
