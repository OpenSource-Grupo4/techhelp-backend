package com.upc.sourcebackend.user.domain.model.aggregates;


import com.upc.sourcebackend.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import com.upc.sourcebackend.user.domain.model.commands.CreateProfileCommand;
import com.upc.sourcebackend.user.domain.model.valueObjects.EmailAddress;
import com.upc.sourcebackend.user.domain.model.valueObjects.PersonName;
import com.upc.sourcebackend.user.domain.model.valueObjects.UserAddress;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User extends AuditableAbstractAggregateRoot<User> {
    @Embedded
    PersonName name;

    @Embedded
    EmailAddress email;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "address_street")),
            @AttributeOverride(name = "number", column = @Column(name = "address_number")),
            @AttributeOverride(name = "city", column = @Column(name = "address_city")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "address_postal_code")),
            @AttributeOverride(name = "country", column = @Column(name = "address_country"))})
    UserAddress address;

    public User(CreateProfileCommand command){
        this.name = new PersonName(command.firstName(), command.lastName());
        this.email = new EmailAddress(command.email());
        this.address = new UserAddress(command.street(),command.number(),command.city(), command.postalCode(), command.country());
    }

    public String getFullName() {return name.getFullName();}

    public String getEmailAddress() {return email.emailAddress();}

    public String getStreetAddress() {return address.getStreetAddress();}

}
