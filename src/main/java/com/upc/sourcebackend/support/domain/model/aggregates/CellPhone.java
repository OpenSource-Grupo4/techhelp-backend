package com.upc.sourcebackend.support.domain.model.aggregates;

import com.upc.sourcebackend.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import com.upc.sourcebackend.support.domain.model.valueObjects.TaskRecord;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Strings;

@Entity
@Getter
public class CellPhone extends AuditableAbstractAggregateRoot<CellPhone> {
    private String name;
    private String model;
    private String brand;

    public CellPhone(){
        this.name = Strings.EMPTY;
        this.model = Strings.EMPTY;
        this.brand = Strings.EMPTY;
    }
}
