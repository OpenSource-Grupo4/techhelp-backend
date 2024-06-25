package com.upc.techelp.platform.community.interfaces.rest.resources;

public record CreateReviewResource(
        String comment,

        String assessment,

        Long technicalId
) {
}
