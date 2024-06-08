package com.upc.sourcebackend.support.domain.model.valueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record TaskId(Long id) {
    public TaskId {
        if(id < 0){
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }

    public TaskId(){
        this(0L);
    }
}
