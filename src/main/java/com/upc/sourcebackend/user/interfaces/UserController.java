package com.upc.sourcebackend.user.interfaces;


import com.upc.sourcebackend.user.domain.model.aggregates.User;
import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import com.upc.sourcebackend.user.domain.model.queries.GetUserByIdQuery;
import com.upc.sourcebackend.user.domain.services.UserCommandService;
import com.upc.sourcebackend.user.domain.services.UserQueryService;
import com.upc.sourcebackend.user.interfaces.rest.resources.CreateUserResource;
import com.upc.sourcebackend.user.interfaces.rest.resources.UserResource;
import com.upc.sourcebackend.user.interfaces.rest.transform.CreateUserCommandFromResourceAssembler;
import com.upc.sourcebackend.user.interfaces.rest.transform.UserResourceFromEntityAssembler;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@Tag(name="User", description = "User Management Endpoints")
public class UserController {
    private final UserCommandService userCommandService;
    private final UserQueryService userQueryService;

    public UserController(UserCommandService userCommandService, UserQueryService userQueryService){
        this.userCommandService = userCommandService;
        this.userQueryService = userQueryService;
    }

    @GetMapping("/{profileId}")
    public ResponseEntity<UserResource> getUserById(@PathVariable Long profileId){
        var getUserByIdQuery = new GetUserByIdQuery(profileId);
        var user = userQueryService.handle(getUserByIdQuery);
        if(user.isEmpty()) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok(UserResourceFromEntityAssembler.transformResourceFromEntity(user.get()));
    }

    @PostMapping
    public ResponseEntity<UserResource> createUser(@RequestBody CreateUserResource resource){
        var createUserCommand = CreateUserCommandFromResourceAssembler.toCommandFromResource(resource);
        var user = userCommandService.handle(createUserCommand);
        if(user.isEmpty()) return ResponseEntity.badRequest().build();

        var userResource = UserResourceFromEntityAssembler.transformResourceFromEntity(user.get());
        return new ResponseEntity<UserResource>(userResource, HttpStatus.CREATED);
    }
}
