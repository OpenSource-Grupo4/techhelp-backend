package com.upc.sourcebackend.user.domain.services;

import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserCommandService {
    Optional<User> handle(CreateProfileCommand command);
}
