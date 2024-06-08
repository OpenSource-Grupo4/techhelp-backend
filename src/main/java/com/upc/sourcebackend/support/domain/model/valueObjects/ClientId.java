package com.upc.sourcebackend.support.domain.model.valueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record ClientId(Long id) {
    public ClientId{
        if(id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
    public ClientId(){
        this(0L);
    }
}
