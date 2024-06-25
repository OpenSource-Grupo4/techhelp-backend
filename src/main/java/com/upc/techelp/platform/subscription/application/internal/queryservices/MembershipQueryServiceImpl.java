package com.upc.techelp.platform.subscription.application.internal.queryservices;

import com.upc.techelp.platform.subscription.domain.model.entities.Membership;
import com.upc.techelp.platform.subscription.domain.model.queries.GetAllMembershipsQuery;
import com.upc.techelp.platform.subscription.domain.model.queries.GetMembershipByIdQuery;
import com.upc.techelp.platform.subscription.domain.services.MembershipQueryService;
import com.upc.techelp.platform.subscription.infrastructure.persistence.jpa.repositories.MembershipRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipQueryServiceImpl implements MembershipQueryService {

    private final MembershipRepository membershipRepository;

    public MembershipQueryServiceImpl(MembershipRepository membershipRepository) { this.membershipRepository = membershipRepository;}

    @Override
    public Optional<Membership> handle(GetMembershipByIdQuery query) { return membershipRepository.findById(query.membershipId());}

    @Override
    public List<Membership> handle(GetAllMembershipsQuery query) { return membershipRepository.findAll();}

}
