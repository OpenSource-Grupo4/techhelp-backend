package com.upc.sourcebackend.user.application.internal;

import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import com.upc.sourcebackend.user.domain.model.queries.GetUserByIdQuery;
import com.upc.sourcebackend.user.domain.model.valueObjects.EmailAddress;
import com.upc.sourcebackend.user.domain.services.UserQueryService;
import com.upc.sourcebackend.user.infrastructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserQueryServiceImpl implements UserQueryService {
    private final UserRepository userRepository;

    public UserQueryServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> handle(GetUserByIdQuery query){ return userRepository.findById(query.id());}
}
