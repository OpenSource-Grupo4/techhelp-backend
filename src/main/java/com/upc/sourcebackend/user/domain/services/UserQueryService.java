package com.upc.sourcebackend.user.domain.services;

import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.domain.model.queries.GetUserByIdQuery;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserQueryService {
    Optional<User> handle(GetUserByIdQuery query);
}
