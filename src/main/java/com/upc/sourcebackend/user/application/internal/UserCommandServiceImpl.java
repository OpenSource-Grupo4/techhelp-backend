package com.upc.sourcebackend.user.application.internal;

import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import com.upc.sourcebackend.user.domain.model.valueObjects.EmailAddress;
import com.upc.sourcebackend.user.domain.services.UserCommandService;
import com.upc.sourcebackend.user.infrastructure.persistence.jpa.repositories.UserRepository;

import java.util.Optional;

public class UserCommandServiceImpl implements UserCommandService {
    private final UserRepository userRepository;

    public UserCommandServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> handle(CreateProfileCommand command){
        var email = new EmailAddress(command.email());

        var profile = new User(command);
        userRepository.save(profile);
        return Optional.of(profile);
    }
}
