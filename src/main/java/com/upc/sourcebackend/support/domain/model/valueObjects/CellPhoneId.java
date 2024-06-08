package com.upc.sourcebackend.support.domain.model.valueObjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record CellPhoneId(Long id) {
    public CellPhoneId{
        if(id < 0) {
            throw new IllegalArgumentException("Id cannot be negative");
        }
    }
    public CellPhoneId(){
        this(0L);
    }
}
