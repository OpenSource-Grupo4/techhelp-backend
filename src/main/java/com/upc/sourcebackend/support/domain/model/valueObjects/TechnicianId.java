package com.upc.sourcebackend.support.domain.model.valueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record TechnicianId(Long id) {
    public TechnicianId{
        if(id < 0){
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }

    public TechnicianId(){
        this(0L);
    }
}
