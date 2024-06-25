package com.logicverse.techelp.platform.iam.domain.model.commands;

import com.logicverse.techelp.platform.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
