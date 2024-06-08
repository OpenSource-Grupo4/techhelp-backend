package com.upc.sourcebackend.support.domain.model.aggregates;

import com.upc.sourcebackend.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import com.upc.sourcebackend.support.domain.model.valueObjects.ClientId;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter
public class Client extends AuditableAbstractAggregateRoot<Client> {
    @Embedded
    @Column(name = "client_id")
    private final ClientId clientId;

    public Client(){
        this.clientId = new ClientId();
    }

}
