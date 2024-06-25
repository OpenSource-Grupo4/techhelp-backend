package com.upc.techelp.platform.repairing.domain.model.queries;

import com.upc.techelp.platform.repairing.domain.model.valueobjects.EmailAddress;

public record GetTechnicalByEmailQuery(EmailAddress email) {
}
