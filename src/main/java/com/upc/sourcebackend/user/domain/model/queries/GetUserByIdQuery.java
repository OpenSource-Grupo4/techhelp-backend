package com.upc.sourcebackend.user.domain.model.queries;

public record GetUserByIdQuery(Long id){
    public GetUserByIdQuery {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }
    }
}
